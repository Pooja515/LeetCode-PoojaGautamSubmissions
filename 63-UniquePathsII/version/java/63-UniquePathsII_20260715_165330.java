// Last updated: 15/07/2026, 16:53:30
1class Solution {
2
3    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
4        if (obstacleGrid == null || obstacleGrid.length == 0)
5            return 0;
6
7        int m = obstacleGrid.length, n = obstacleGrid[0].length;
8
9        if (obstacleGrid[0][0] == 1 || obstacleGrid[m - 1][n - 1] == 1)
10            return 0;
11
12        int[] dp = new int[n];
13
14        for (int i = 0; i < m; i++) {
15               int[] cur = new int[n];
16            for (int j = 0; j < n; j++) {
17                if (i == 0 && j == 0) {
18                      cur[j] =1;
19                      continue;
20                }
21                
22                if (obstacleGrid[i][j] == 1){
23                    cur[j] =  0;
24                    continue;
25                }
26                
27
28                int up = 0 , left = 0;
29                if(i>0) up =   dp[j];
30                if(j>0) left = cur[j - 1];
31
32                cur[j] = up + left;
33            }
34            dp = cur;
35        }
36       return dp[n-1];
37    }
38}