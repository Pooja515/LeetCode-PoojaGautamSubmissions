// Last updated: 12/08/2026, 01:30:14
1class Solution {
2    public int maxProfit(int[] prices) {
3        int n= prices.length;
4        int[][] dp = new int[n+1][2];
5  
6        for(int i = n-1;i>=0;i--){
7          dp[i][0] = Math.max(prices[i] + dp[i+1][1], 0 + dp[i+1][0]);
8         
9          dp[i][1] = Math.max(-prices[i] + dp[i+1][0], 0 + dp[i+1][1]);
10        }
11        return dp[0][1];
12    }
13}
14