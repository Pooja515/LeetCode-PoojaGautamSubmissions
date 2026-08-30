// Last updated: 31/08/2026, 01:08:24
1class Solution {
2
3    public int coinChange(int[] coins, int amount) {
4        int n = coins.length;
5        int[][] dp = new int[n][amount + 1];
6     // BASE CASE if(n==1)
7           for (int t = 0; t <= amount; t++) {
8            if (t % coins[0] == 0) {
9                dp[0][t] = t / coins[0];
10            } else
11                dp[0][t] = (int) 1e9;
12
13        }
14
15        for (int i = 1; i < n; i++) {
16            for (int t = 0; t <= amount; t++) {
17                int nottake = 0 + dp[i - 1][t];
18                int take = (int) 1e9;
19                if (coins[i] <= t) {
20                    take = 1 + dp[i][t - coins[i]];
21                }
22                dp[i][t] = Math.min(take, nottake);
23            }
24        }
25        return dp[n - 1][amount] >= (int) 1e9 ?-1: dp[n-1][amount];
26    }
27}