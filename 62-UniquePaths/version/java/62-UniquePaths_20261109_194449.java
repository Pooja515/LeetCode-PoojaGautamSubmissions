// Last updated: 09/11/2026, 19:44:49
1class Solution {
2
3    public int uniquePaths(int m, int n) {
4        if (m == 0 || n == 0)
5            return 0;
6        int[][] dp = new int[m][n];
7
8        for (int i = 0; i < m; i++) {
9            for (int j = 0; j < n; j++) {
10                if (i == 0 && j == 0) {
11                    dp[i][j] = 1;
12                    continue;
13                }
14                int up = 0;
15                if(i>0) up = dp[i - 1][j];
16                int left = 0;
17                if(j>0) left = dp[i][j - 1];
18
19                dp[i][j] = up + left;
20            }
21        }
22        return dp[m - 1][n - 1];
23    }
24}