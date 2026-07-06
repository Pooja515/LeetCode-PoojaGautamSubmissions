// Last updated: 06/07/2026, 11:35:45
1class Solution {
2    public int maxProfit(int[] prices, int fee) {
3          int n = prices.length;
4        int[][] dp = new int[n+1][2];
5        
6        for(int i= n-1 ;i >= 0;i--){
7            dp[i][0] = Math.max(prices[i] - fee + dp[i+1][1] ,dp[i+1][0]);
8            dp[i][1] = Math.max(-prices[i] + dp[i+1][0] ,dp[i+1][1]);
9        }
10        return dp[0][1]; 
11    }
12}
13
14