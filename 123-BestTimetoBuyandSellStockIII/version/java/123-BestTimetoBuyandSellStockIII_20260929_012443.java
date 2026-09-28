// Last updated: 29/09/2026, 01:24:43
1class Solution {
2   
3    public int maxProfit(int[] prices) {
4        int n = prices.length;
5        int[][][] dp = new int[n+1][2][3];
6       
7  
8       for(int i=n-1;i>=0;i--){
9        for(int k=1;k<3;k++){
10            int selltoday = prices[i] + dp[i+1][1][k-1];
11            int skip = 0 + dp[i+1][0][k];
12            dp[i][0][k]=Math.max(selltoday,skip);
13
14            int buytoday =  -prices[i] + dp[i+1][0][k];
15            int skiptoday = 0 + dp[i+1][1][k];
16            dp[i][1][k]=Math.max(buytoday,skiptoday);
17        }
18       }
19       return dp[0][1][2];
20
21    }
22}