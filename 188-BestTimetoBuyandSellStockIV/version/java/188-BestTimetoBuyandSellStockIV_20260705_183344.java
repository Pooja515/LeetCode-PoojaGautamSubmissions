// Last updated: 05/07/2026, 18:33:44
1class Solution {
2
3    public int maxProfit(int k, int[] prices) {
4
5        int n = prices.length;
6
7        int[][][] dp = new int[n + 1][2][k+1];
8
9        for (int day = n - 1; day >= 0; day--) {
10
11            for (int transactionsLeft = 1; transactionsLeft <= k; transactionsLeft++) {
12
13                // Not holding stock
14                dp[day][0][transactionsLeft] = Math.max(
15                        -prices[day] + dp[day + 1][1][transactionsLeft],
16                        dp[day + 1][0][transactionsLeft]
17                );
18
19                // Holding stock
20                dp[day][1][transactionsLeft] = Math.max(
21                        prices[day] + dp[day + 1][0][transactionsLeft - 1],
22                        dp[day + 1][1][transactionsLeft]
23                );
24            }
25        }
26
27        return dp[0][0][k];
28    }
29}