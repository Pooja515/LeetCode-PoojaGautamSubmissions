// Last updated: 19/09/2026, 19:31:55
1class Solution {
2
3    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
4        if (obstacleGrid == null || obstacleGrid.length == 0)
5            return 0;
6        int m = obstacleGrid.length, n = obstacleGrid[0].length;
7        if (obstacleGrid[0][0] == 1 || obstacleGrid[m - 1][n - 1] == 1)
8            return 0;
9
10        int[] dp= new int [n];
11        
12        for(int i=0;i<m;i++){
13             int[] cur = new int [n];
14            for(int j=0;j<n;j++){
15                 if(i==0 && j== 0) {
16                    cur[j] =1;
17                    continue;
18                 } 
19        
20                if(i<0 || j<0) {
21                    cur[j]= 0;
22                    continue;
23                }
24
25                if(obstacleGrid[i][j] == 1) {
26                    cur[j] =0;
27                    continue;
28                }
29
30                int up = 0, left =0;
31                if(i>0) up = dp[j];
32                if(j>0) left = cur[j-1];
33
34                cur[j] = up + left;
35            }
36            dp=cur;
37        }
38       return dp[n-1];
39    }
40}