// Last updated: 29/09/2026, 17:10:29
1class Solution {
2   
3    public int maxProfit(int k, int[] prices) {
4        int n=prices.length;
5
6        if(n==0 || k==0) return 0;
7        int[][] dp =new int [2][k+1];
8
9        for(int i=n-1;i>=0;i--){
10             int[][] cur =new int [2][k+1];
11            for(int j=1;j<=k;j++){
12               int selltoday= prices[i] +dp[1][j-1];
13               int skipsell= 0 +dp[0][j];
14               cur[0][j]=Math.max(selltoday,skipsell);
15
16                int buytoday= -prices[i] +dp[0][j];
17                int skiptoday= 0 +dp[1][j];
18                cur[1][j]=Math.max(buytoday,skiptoday);
19            }
20            dp=cur;
21        }
22      return dp[1][k];
23    }
24}