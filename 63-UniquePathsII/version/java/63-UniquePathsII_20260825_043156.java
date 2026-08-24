// Last updated: 25/08/2026, 04:31:56
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
11        int[] dp = new int [n];
12        for (int i = 0; i < m; i++) {
13            int[] cur = new int [n];
14            for (int j = 0; j < n; j++) {
15                if (i == 0 && j == 0) {
16                    cur[j] = 1;
17                }
18
19                else {
20
21                    if (i < 0 || j < 0) {
22                        cur[j] = 0;
23                        continue;
24                    }
25                    if (obstacleGrid[i][j] == 1) {
26                        cur[j] = 0;
27                        continue;
28                    }
29
30                    int up = 0, left = 0;
31                    if (i > 0)
32                        up = dp[j];
33                    if (j > 0)
34                        left = cur[j - 1];
35
36                    cur[j] = up + left;
37                }
38            }
39            dp=cur;
40        }
41        return dp[n - 1];
42
43    }
44}