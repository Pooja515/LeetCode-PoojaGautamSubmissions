// Last updated: 28/09/2026, 15:41:21
1class Solution {
2   
3    public int maxProfit(int[] prices) {
4        int n = prices.length;
5        int[][] dp = new int[n+1][2];
6       
7        for(int i=n-1;i>=0;i--){
8            int selltoday = prices[i]+dp[i+1][1];
9            int notsell= 0+ dp[i+1][0];
10            dp[i][0] =Math.max(selltoday,notsell);
11
12            int buytoday = -prices[i]+dp[i+1][0];
13            int notbuy= 0+  dp[i+1][1];
14            dp[i][1]=Math.max(buytoday,notbuy);
15
16        }
17
18     return dp[0][1];
19    }
20}