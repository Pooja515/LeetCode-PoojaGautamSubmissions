// Last updated: 15/08/2026, 18:19:29
1class Solution {
2
3    public int coinChange(int[] coins, int amount) {
4        int n = coins.length;
5        int[][] dp = new int[n][amount + 1];
6
7        for (int t = 0; t <= amount; t++) {
8            if (t % coins[0] == 0) {
9                dp[0][t] = t / coins[0];
10            } else
11                dp[0][t] = (int) 1e9;
12
13        }
14
15        for (int ind = 1; ind < n; ind++) {
16            for (int t = 0; t <= amount; t++) {
17                //nottake
18                int nottake = 0 + dp[ind - 1][t];
19                int take = (int) 1e9;
20                if (coins[ind] <= t) {
21                    take = 1 + dp[ind][t - coins[ind]];
22                }
23
24                dp[ind][t] = Math.min(take, nottake);
25            }
26        }
27        return dp[n-1][amount] >= (int) 1e9 ?-1:dp[n-1][amount];
28    }
29}