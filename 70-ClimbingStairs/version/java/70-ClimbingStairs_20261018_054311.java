// Last updated: 18/10/2026, 05:43:11
1class Solution {
2   public int climbStairs(int n) {
3       if (n <= 2)
4           return n;
5       int[] dp = new int[n + 1];
6       dp[0] = 1;
7       dp[1] = 1;
8
9
10       for (int i = 2; i <= n; i++) {
11           dp[i] = dp[i - 1] + dp[i - 2];
12       }
13       return dp[n];
14   }
15}
16