// Last updated: 29/09/2026, 18:39:29
1class Solution {
2    public int maxProfit(int[] prices) {
3        int n= prices.length;
4       int[][] dp =new int[n+2][2]; 
5       for(int i=n-1;i>=0;i--){
6        int selltoday = prices[i] + dp[i+2][1];
7        int skipsell = 0 + dp[i+1][0];
8        dp[i][0] = Math.max(selltoday,skipsell);
9
10        int buytoday = -prices[i] + dp[i+1][0];
11        int skipbuy = 0 + dp[i+1][1];
12        dp[i][1]=Math.max(buytoday,skipbuy);
13       }
14
15       return dp[0][1];
16    }
17}