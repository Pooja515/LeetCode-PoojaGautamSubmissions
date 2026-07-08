// Last updated: 08/07/2026, 17:44:47
1class Solution {
2    public int maxProfit(int k, int[] prices) {
3       int n = prices.length;
4       int[][] dp = new int[2][k+1]; 
5       for(int i =n-1 ;i>= 0 ;i--){
6        for(int j= 1 ;j<=k;j++){
7            dp[0][j] = Math.max(prices[i] + dp[1][j-1] , 0+ dp[0][j]);
8            dp[1][j] = Math.max(-prices[i] + dp[0][j] , 0+dp[1][j]);
9        }
10       }
11       return dp[1][k];
12    }
13}