// Last updated: 06/07/2026, 14:08:32
1class Solution {
2
3    public int maxProfit(int[] prices) {
4        int n = prices.length;
5
6        int[] dp = new int [2];
7
8        for (int ind = n - 1; ind >= 0; ind--) {
9             int[] cur = new int [2];
10            // can sell
11            cur[0] = Math.max(prices[ind] + dp[1], dp[0]);
12            // can buy
13            cur[1] = Math.max(-prices[ind] + dp[0], dp[1]);
14            
15            dp = cur;
16        }
17        return dp[1];
18    }
19}