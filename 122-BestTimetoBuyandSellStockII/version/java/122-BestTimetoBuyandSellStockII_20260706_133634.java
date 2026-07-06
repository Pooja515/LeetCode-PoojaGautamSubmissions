// Last updated: 06/07/2026, 13:36:34
1class Solution {
2
3    public int maxProfit(int[] prices) {
4        int n = prices.length;
5
6        int[][] dp = new int[n+1][2];
7       
8        for(int ind = n-1 ;ind >= 0 ; ind--){
9    
10            // can sell
11            dp[ind][0] =Math.max(prices[ind] + dp[ind+1][1] , dp[ind+1][0]);
12             // can buy
13            dp[ind][1] =Math.max(-prices[ind] + dp[ind+1][0] , dp[ind+1][1]);
14    
15        }
16       return dp[0][1];
17    }
18}