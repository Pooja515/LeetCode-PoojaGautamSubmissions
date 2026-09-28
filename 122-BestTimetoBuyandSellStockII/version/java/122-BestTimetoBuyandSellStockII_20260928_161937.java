// Last updated: 28/09/2026, 16:19:37
1class Solution {
2   
3    public int maxProfit(int[] prices) {
4        int n = prices.length;
5        int[] dp = new int [2];
6       
7        for(int i=n-1;i>=0;i--){
8            int[] cur = new int [2];
9            int selltoday = prices[i]+dp[1];
10            int notsell= 0+ dp[0];
11            cur[0] =Math.max(selltoday,notsell);
12
13            int buytoday = -prices[i]+dp[0];
14            int notbuy= 0+  dp[1];
15            cur[1]=Math.max(buytoday,notbuy);
16
17            dp=cur;
18
19        }
20
21     return dp[1];
22    }
23}