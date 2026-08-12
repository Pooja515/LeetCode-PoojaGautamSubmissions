// Last updated: 13/08/2026, 02:55:55
1class Solution {
2   
3    public int maxProfit(int[] prices, int fee) {
4        int n = prices.length;
5         int[] dp = new int[2];
6         dp[0] =0;
7         dp[1] =0;
8       
9         for(int i=n-1;i>=0;i--){
10             int[] cur = new int[2];
11            cur[0]= Math.max(prices[i] + dp[1] - fee ,dp[0]);
12            cur[1]= Math.max(-prices[i] + dp[0] ,dp[1]);
13            dp=cur;
14         }
15        return dp[1];
16    }
17}