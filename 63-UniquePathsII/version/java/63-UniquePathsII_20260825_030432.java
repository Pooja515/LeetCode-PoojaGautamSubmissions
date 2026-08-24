// Last updated: 25/08/2026, 03:04:32
1class Solution {
2    int[][] memo;
3    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
4        if(obstacleGrid == null || obstacleGrid.length == 0 ) return 0;
5        int m= obstacleGrid.length , n= obstacleGrid[0].length;
6
7        memo= new int[m][n];
8        for(int[] rows : memo){
9            Arrays.fill(rows,-1);
10        }
11
12        if(obstacleGrid[0][0] == 1 || obstacleGrid[m-1][n-1] == 1) return 0;
13
14        return f(m-1,n-1,obstacleGrid);
15
16    }
17    int f(int i , int j, int[][]  obstacleGrid){
18        // base case
19        if(i==0 && j==0 ) return 1;
20        if(i<0 || j<0 || i > obstacleGrid.length-1 || j>obstacleGrid[0].length-1) return 0;
21        if(obstacleGrid[i][j] == 1) return 0;
22
23        if(memo[i][j] != -1) return memo[i][j];
24        
25        int up =0,left =0;
26        if(i > 0) up = f(i-1,j,obstacleGrid);
27        if(j > 0) left = f(i,j-1,obstacleGrid);
28
29        return memo[i][j] = up+left;
30    }
31}