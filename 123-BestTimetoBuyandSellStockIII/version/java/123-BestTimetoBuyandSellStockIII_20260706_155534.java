// Last updated: 06/07/2026, 15:55:34
1class Solution {
2    public int maxProfit(int[] prices) {
3        int n = prices.length;
4        int[][] dp = new int [2][3];
5        for(int ind= n-1 ; ind >= 0 ; ind--){
6            int[][] cur = new int [2][3];
7            for(int trans = 1;trans <= 2 ; trans++ ){
8                cur[0][trans] = Math.max(prices[ind] + dp[1][trans-1] , dp[0][trans]);
9                cur[1][trans] = Math.max(-prices[ind] + dp[0][trans] , dp[1][trans]);
10            }
11            dp = cur;
12        }
13        return dp[1][2];
14    }
15}