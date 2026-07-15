// Last updated: 15/07/2026, 16:54:23
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
12       int[] cur = new int[n];
13
14        for (int i = 0; i < m; i++) {
15            for (int j = 0; j < n; j++) {
16                if (i == 0 && j == 0) {
17                      cur[j] =1;
18                      continue;
19                }
20                
21                if (obstacleGrid[i][j] == 1){
22                    cur[j] =  0;
23                    continue;
24                }
25                
26
27                int up = 0 , left = 0;
28                if(i>0) up =   cur[j];
29                if(j>0) left = cur[j - 1];
30
31                cur[j] = up + left;
32            }
33        }
34       return cur[n-1];
35    }
36}