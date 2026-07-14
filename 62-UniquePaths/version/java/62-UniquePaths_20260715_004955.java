// Last updated: 15/07/2026, 00:49:55
1class Solution {
2
3    public int uniquePaths(int m, int n) {
4        if (m == 0)
5            return 0;
6
7        int[] dp = new int[n];
8
9        for (int i = 0; i < m; i++) {
10            for (int j = 0; j < n; j++) {
11                if (i == 0 && j == 0) {
12                    dp[j] = 1;
13                    continue;
14                }
15
16                int left = 0, up = 0;
17                if (i > 0)
18                    up = dp[j];
19                if (j > 0)
20                    left = dp[j - 1];
21                dp[j] = left + up;
22            }
23       
24        }
25        return dp[n - 1];
26    }
27}