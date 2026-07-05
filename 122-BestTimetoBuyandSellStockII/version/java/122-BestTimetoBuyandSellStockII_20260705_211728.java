// Last updated: 05/07/2026, 21:17:28
1class Solution {
2  
3    public int maxProfit(int[] prices) {
4       int n = prices.length;
5        int[][] dp = new int[n+1][2];
6        dp[n][0] =0;
7        dp[n][1] =0;
8     
9        for(int ind = n-1 ;ind>=0 ;ind--){
10             dp[ind][0]= Math.max(prices[ind] + dp[ind + 1][1], 0 + dp[ind + 1][0]);
11                   
12            dp[ind][1]= Math.max(-prices[ind] + dp[ind + 1][0] ,0 + dp[ind + 1][1]);
13            
14        }
15
16    return dp[0][1];
17    }
18}