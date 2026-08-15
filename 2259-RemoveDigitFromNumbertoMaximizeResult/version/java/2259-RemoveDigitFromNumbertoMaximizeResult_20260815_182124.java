// Last updated: 15/08/2026, 18:21:24
1class Solution {
2
3    public int coinChange(int[] coins, int amount) {
4        int n = coins.length;
5        int[] dp = new int [amount + 1];
6
7        for (int t = 0; t <= amount; t++) {
8            if (t % coins[0] == 0) {
9                dp[t] = t / coins[0];
10            } else
11                dp[t] = (int) 1e9;
12
13        }
14
15        for (int ind = 1; ind < n; ind++) {
16             int[] cur = new int [amount + 1];
17            for (int t = 0; t <= amount; t++) {
18                //nottake
19                int nottake = 0 + dp[t];
20                int take = (int) 1e9;
21                if (coins[ind] <= t) {
22                    take = 1 + cur[t - coins[ind]];
23                }
24
25                cur[t] = Math.min(take, nottake);
26            }
27            dp=cur;
28        }
29        return dp[amount] >= (int) 1e9 ?-1:dp[amount];
30    }
31}