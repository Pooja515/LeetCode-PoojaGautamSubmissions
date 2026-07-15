// Last updated: 15/07/2026, 16:43:25
1class Solution {
2    int[][] memo;
3    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
4        if (obstacleGrid == null || obstacleGrid.length == 0)
5            return 0;
6
7        int m = obstacleGrid.length, n = obstacleGrid[0].length;
8
9        if (obstacleGrid[0][0] == 1 || obstacleGrid[m - 1][n - 1] == 1)
10            return 0;
11        
12        memo = new int[m][n];
13        for(int[] r : memo){
14            Arrays.fill(r , -1);
15        }
16
17        return f(m - 1, n - 1, obstacleGrid);
18
19    }
20
21    int f(int i, int j, int[][] obstacleGrid) {
22        if (i == 0 && j == 0) {
23            return 1;
24        }
25        if (i < 0 || j < 0)
26            return 0;
27        if (obstacleGrid[i][j] == 1)
28            return 0;
29        
30        if(memo[i][j] != -1) return memo[i][j];
31        int up = f(i - 1, j, obstacleGrid);
32        int left = f(i, j - 1, obstacleGrid);
33
34        return memo[i][j] = up + left;
35    }
36}