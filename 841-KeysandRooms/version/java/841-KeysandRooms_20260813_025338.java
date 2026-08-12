// Last updated: 13/08/2026, 02:53:38
1class Solution {
2   
3    public int maxProfit(int[] prices, int fee) {
4        int n = prices.length;
5         int[][] dp = new int[n+1][2];
6         dp[n][0] =0;
7         dp[n][1] =0;
8       
9         for(int i=n-1;i>=0;i--){
10            dp[i][0]= Math.max(prices[i] + dp[i+1][1] - fee ,dp[i+1][0]);
11            dp[i][1]= Math.max(-prices[i] + dp[i+1][0] ,dp[i+1][1]);
12         }
13        return dp[0][1];
14    }
15}