// Last updated: 25/08/2026, 03:38:45
1class Solution {
2
3    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
4        if (obstacleGrid == null || obstacleGrid.length == 0)
5            return 0;
6        int m = obstacleGrid.length, n = obstacleGrid[0].length;
7
8        if (obstacleGrid[0][0] == 1 || obstacleGrid[m - 1][n - 1] == 1)
9            return 0;
10
11        int[][] dp = new int[m][n];
12        for (int i = 0; i < m; i++) {
13            for (int j = 0; j < n; j++) {
14                if (i == 0 && j == 0) {
15                    dp[i][j] = 1;
16                }
17
18                else {
19
20                    if (i < 0 || j < 0) {
21                        dp[i][j] = 0;
22                        continue;
23                    }
24                    if (obstacleGrid[i][j] == 1) {
25                        dp[i][j] = 0;
26                        continue;
27                    }
28
29                    int up = 0, left = 0;
30                    if (i > 0)
31                        up = dp[i - 1][j];
32                    if (j > 0)
33                        left = dp[i][j - 1];
34
35                    dp[i][j] = up + left;
36                }
37            }
38        }
39        return dp[m - 1][n - 1];
40
41    }
42}