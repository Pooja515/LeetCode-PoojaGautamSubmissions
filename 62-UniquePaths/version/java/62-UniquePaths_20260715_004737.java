// Last updated: 15/07/2026, 00:47:37
1class Solution {
2
3    public int uniquePaths(int m, int n) {
4        if (m == 0)
5            return 0;
6
7        int[] dp = new int[n];
8
9        for (int i = 0; i < m; i++) {
10            int[] cur = new int[n];
11
12            for (int j = 0; j < n; j++) {
13                if (i == 0 && j == 0) {
14                    cur[j] = 1;
15                    continue;
16                }
17
18                int left = 0, up = 0;
19                if (i > 0)
20                    up = dp[j];
21                if (j > 0)
22                    left = cur[j - 1];
23                cur[j] = left + up;
24            }
25            dp = cur;
26        }
27        return dp[n - 1];
28    }
29}