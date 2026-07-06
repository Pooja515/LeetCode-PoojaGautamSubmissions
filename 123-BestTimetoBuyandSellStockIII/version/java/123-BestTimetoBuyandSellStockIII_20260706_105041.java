// Last updated: 06/07/2026, 10:50:41
1class Solution {
2
3    public int maxProfit(int[] prices) {
4        int n = prices.length;
5
6        int[][][] dp = new int[n + 1][2][3];
7
8        for (int day = n - 1; day >= 0; day--) {
9
10            for (int transactionsLeft = 1; transactionsLeft <= 2; transactionsLeft++) {
11
12                // Not holding stock
13                dp[day][0][transactionsLeft] = Math.max(
14                        -prices[day] + dp[day + 1][1][transactionsLeft],
15                        dp[day + 1][0][transactionsLeft]
16                );
17
18                // Holding stock
19                dp[day][1][transactionsLeft] = Math.max(
20                        prices[day] + dp[day + 1][0][transactionsLeft - 1],
21                        dp[day + 1][1][transactionsLeft]
22                );
23            }
24        }
25
26        return dp[0][0][2];
27    }
28}