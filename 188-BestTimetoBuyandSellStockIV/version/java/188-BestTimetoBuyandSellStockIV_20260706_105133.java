// Last updated: 06/07/2026, 10:51:33
1class Solution {
2    public int maxProfit(int k, int[] prices) {
3        int n = prices.length;
4
5        int[][][] dp = new int[n + 1][2][k+1];
6
7        for (int day = n - 1; day >= 0; day--) {
8            for (int transactionsLeft = 1; transactionsLeft <= k; transactionsLeft++) {
9                // Not holding stock
10                dp[day][0][transactionsLeft] = Math.max(
11                        -prices[day] + dp[day + 1][1][transactionsLeft],
12                        dp[day + 1][0][transactionsLeft]
13                );
14                // Holding stock
15                dp[day][1][transactionsLeft] = Math.max(
16                        prices[day] + dp[day + 1][0][transactionsLeft - 1],
17                        dp[day + 1][1][transactionsLeft]
18                );
19            }
20        }
21
22        return dp[0][0][k];
23    }
24}