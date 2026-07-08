// Last updated: 08/07/2026, 23:39:03
1class Solution {
2    public int maxProfit(int[] prices, int fee) {
3        int n = prices.length;
4        int[][] dp = new int[n+1][2];
5        for(int ind = n-1 ; ind >= 0 ;ind--){
6            //sell
7            dp[ind][0] = Math.max(prices[ind] + dp[ind+1][1] - fee , 0 + dp[ind+1][0]);
8            //buy
9            dp[ind][1] = Math.max(-prices[ind] + dp[ind+1][0] , 0 + dp[ind+1][1]);
10        }
11        return dp[0][1];
12    }
13}