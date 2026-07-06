// Last updated: 06/07/2026, 15:50:53
1class Solution {
2    public int maxProfit(int[] prices) {
3        int n = prices.length;
4        int[][][] dp = new int[n+1][2][3];
5        for(int ind= n-1 ; ind >= 0 ; ind--){
6            for(int trans = 1;trans <= 2 ; trans++ ){
7                dp[ind][0][trans] = Math.max(prices[ind] + dp[ind+1][1][trans-1] , dp[ind+1][0][trans]);
8                dp[ind][1][trans] = Math.max(-prices[ind] + dp[ind+1][0][trans] , dp[ind+1][1][trans]);
9            }
10        }
11        return dp[0][1][2];
12    }
13}