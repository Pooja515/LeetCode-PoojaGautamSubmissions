// Last updated: 28/09/2026, 22:34:01
1class Solution {
2   
3    public int maxProfit(int[] prices) {
4        int n = prices.length;
5        int[] dp = new int[2];
6        for(int i=n-1;i>=0;i--){
7            int[] cur = new int[2];
8            int selltoday = prices[i] + dp[1];
9            int skiptoday = 0 + dp[0];
10            cur[0]= Math.max(selltoday , skiptoday);
11
12            int buytoday = -prices[i] + dp[0];
13            int skip = 0 + dp[1];
14            cur[1]= Math.max(buytoday , skip);
15
16            dp=cur;
17    
18        }
19   return dp[1];
20    }
21}