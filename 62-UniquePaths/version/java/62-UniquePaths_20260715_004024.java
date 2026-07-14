// Last updated: 15/07/2026, 00:40:24
1class Solution {
2
3    public int uniquePaths(int m, int n) {
4        if (m == 0)
5            return 0;
6
7        int[][] dp = new int[m][n];
8
9        for (int i = 0; i < m; i++) {
10            for (int j = 0; j < n; j++) {
11                if (i == 0 && j == 0) {
12                    dp[i][j] = 1;
13                    continue;
14                }
15
16                int left = 0, up = 0;
17                if (i > 0)
18                    up = dp[i - 1][j];
19
20                if (j > 0)
21                    left = dp[i][j - 1];
22
23                dp[i][j] = left + up;
24            }
25        }
26        return dp[m - 1][n - 1];
27    }
28}