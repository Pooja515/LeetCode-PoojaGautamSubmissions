// Last updated: 06/07/2026, 11:28:04
1class Solution {
2    public int maxProfit(int[] prices) {
3        int n = prices.length;
4        int[][] dp = new int[n+2][2];
5        
6        for(int i= n-1 ;i >= 0;i--){
7            dp[i][0] = Math.max(prices[i] + dp[i+2][1] ,dp[i+1][0]);
8            dp[i][1] = Math.max(-prices[i] + dp[i+1][0] ,dp[i+1][1]);
9        }
10        return dp[0][1];
11    }
12}