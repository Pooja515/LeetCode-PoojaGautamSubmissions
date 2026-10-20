// Last updated: 21/10/2026, 00:06:19
1class Solution {
2    int[][] memo;
3    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
4        int m=obstacleGrid.length , n = obstacleGrid[0].length;
5
6        memo = new int[m][n];
7        for(int[] rows:memo){
8            Arrays.fill(rows,-1);
9        }
10
11        if(m==0 || n==0) return 0;
12
13        if(obstacleGrid[0][0] == 1 || obstacleGrid[m-1][n-1] == 1) return 0;
14
15        return f(m-1,n-1,obstacleGrid);
16    }
17    
18    int f(int i,int j,int[][] obstacleGrid){
19
20        if(i==0 && j==0) return 1;
21        if(i<0 || j<0) return 0;
22        if(obstacleGrid[i][j] == 1) return 0;
23
24        if(memo[i][j] != -1) return memo[i][j];
25
26        int up = f(i-1,j,obstacleGrid);
27        int left = f(i,j-1,obstacleGrid);
28
29        return memo[i][j] = up + left;
30    }
31}
32        