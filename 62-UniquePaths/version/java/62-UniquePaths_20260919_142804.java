// Last updated: 19/09/2026, 14:28:04
1class Solution {
2
3    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
4        if (obstacleGrid == null || obstacleGrid.length == 0)
5            return 0;
6        int m = obstacleGrid.length, n = obstacleGrid[0].length;
7        if (obstacleGrid[0][0] == 1 || obstacleGrid[m - 1][n - 1] == 1)
8            return 0;
9
10        int[][] dp= new int[m][n];
11        
12        for(int i=0;i<m;i++){
13            for(int j=0;j<n;j++){
14                 if(i==0 && j== 0) {
15                    dp[i][j] =1;
16                    continue;
17                 } 
18        
19                if(i<0 || j<0) {
20                    dp[i][j]= 0;
21                    continue;
22                }
23
24                if(obstacleGrid[i][j] == 1) {
25                    dp[i][j] =0;
26                    continue;
27                }
28
29                int up = 0, left =0;
30                if(i>0) up = dp[i-1][j];
31                if(j>0) left = dp[i][j-1];
32
33                dp[i][j] = up + left;
34            }
35        }
36       return dp[m-1][n-1];
37    }
38}