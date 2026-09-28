// Last updated: 28/09/2026, 21:56:58
1class Solution {
2   
3    public int maxProfit(int[] prices) {
4        int n = prices.length;
5        int[][] dp = new int[n+1][2];
6        for(int i=n-1;i>=0;i--){
7            int selltoday = prices[i] + dp[i+1][1];
8            int skiptoday = 0 + dp[i+1][0];
9            dp[i][0]= Math.max(selltoday , skiptoday);
10
11            int buytoday = -prices[i] + dp[i+1][0];
12            int skip = 0 + dp[i+1][1];
13            dp[i][1]= Math.max(buytoday , skip);
14    
15        }
16   return dp[0][1];
17    }
18}