// Last updated: 08/07/2026, 20:36:53
1class Solution {
2    public int maxProfit(int[] prices) {
3        int n = prices.length;
4        int[][] dp = new int[n+2][2];
5        for(int ind = n-1 ; ind >= 0 ; ind--){
6            dp[ind][0] = Math.max(prices[ind] + dp[ind+2][1] , 0 + dp[ind+1][0]);
7            dp[ind][1] = Math.max(-prices[ind] + dp[ind+1][0] , 0 + dp[ind+1][1]);
8        }
9        return dp[0][1];
10    }
11}