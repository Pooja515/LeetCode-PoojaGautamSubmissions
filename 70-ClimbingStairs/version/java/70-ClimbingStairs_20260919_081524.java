// Last updated: 19/09/2026, 08:15:24
1class Solution {
2
3    public int climbStairs(int n) {
4        if (n == 1 || n == 2)
5            return n;
6        int[] dp = new int[n + 1];
7        dp[0] = 1;
8        dp[1] = 1;
9
10        for (int i = 2; i <= n; i++) {
11            int climb1 = dp[i - 1];
12            int climb2 = dp[i - 2];
13            dp[i] = climb1 + climb2;
14        }
15        return dp[n];
16    }
17}