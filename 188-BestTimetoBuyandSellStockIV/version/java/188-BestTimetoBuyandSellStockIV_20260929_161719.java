// Last updated: 29/09/2026, 16:17:19
1class Solution {
2   
3    public int maxProfit(int k, int[] prices) {
4        int n=prices.length;
5
6        if(n==0 || k==0) return 0;
7        int[][][] dp =new int[n+1][2][k+1];
8
9        for(int i=n-1;i>=0;i--){
10            for(int j=1;j<=k;j++){
11               int selltoday= prices[i] +dp[i+1][1][j-1];
12               int skipsell= 0 +dp[i+1][0][j];
13               dp[i][0][j]=Math.max(selltoday,skipsell);
14
15                int buytoday= -prices[i] +dp[i+1][0][j];
16                int skiptoday= 0 +dp[i+1][1][j];
17                dp[i][1][j]=Math.max(buytoday,skiptoday);
18            }
19        }
20      return dp[0][1][k];
21    }
22}