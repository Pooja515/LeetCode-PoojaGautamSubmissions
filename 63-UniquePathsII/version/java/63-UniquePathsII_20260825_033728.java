// Last updated: 25/08/2026, 03:37:28
1class Solution {
2
3    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
4        if(obstacleGrid == null || obstacleGrid.length == 0 ) return 0;
5        int m= obstacleGrid.length , n= obstacleGrid[0].length;
6
7        if(obstacleGrid[0][0] == 1 || obstacleGrid[m-1][n-1] == 1) return 0;
8
9        int[][] dp = new int[m][n];
10        for(int i=0;i<m;i++){
11            for(int j=0;j<n;j++){
12                if(i==0 && j==0){
13                    dp[i][j] =1;
14                }
15
16                else{
17
18                    if(i<0 || j<0) dp[i][j] = 0;
19                    if(obstacleGrid[i][j] == 1) {
20                        dp[i][j] = 0;
21                        continue;
22                    }
23
24                    int up =0,left =0;
25                    if(i > 0) up = dp[i-1][j];
26                    if(j > 0) left = dp[i][j-1];
27
28                    dp[i][j] = up+left;
29                            }
30                        }
31                    }
32       return dp[m-1][n-1]; 
33    
34    }
35}