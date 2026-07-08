// Last updated: 08/07/2026, 18:02:21
1class Solution {
2    public int maxProfit(int k, int[] prices) {
3       int n = prices.length;
4       int[][] dp = new int[2][k+1]; 
5       for(int ind = n-1 ;ind >= 0 ;ind--){
6        for(int trans = 1 ;trans <= k;trans++){
7            dp[0][trans] = Math.max(prices[ind] + dp[1][trans-1] , 0+ dp[0][trans]);
8            dp[1][trans] = Math.max(-prices[ind] + dp[0][trans] , 0+dp[1][trans]);
9        }
10       }
11       return dp[1][k];
12    }
13}