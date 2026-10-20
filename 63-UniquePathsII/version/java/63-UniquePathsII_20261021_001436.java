// Last updated: 21/10/2026, 00:14:36
1class Solution {
2   
3    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
4        int m=obstacleGrid.length , n = obstacleGrid[0].length;
5        if(m==0 || n==0) return 0;
6
7        if(obstacleGrid[0][0] == 1 || obstacleGrid[m-1][n-1] == 1) return 0;
8
9        int[] dp = new int[n];
10        for(int i=0;i<m;i++){
11               int[] cur = new int[n];
12            for(int j=0;j<n;j++){
13                if(i==0 && j==0){
14                    cur[j] =1;
15                    continue;
16                }
17                if(obstacleGrid[i][j] == 1) {
18                    cur[j]= 0;
19                    continue;
20                }
21
22                int up = 0;
23                if(i>0) up=dp[j];
24                int left = 0;
25                if(j>0) left= cur[j-1];
26
27                cur[j] = up + left;
28            
29            }
30            dp=cur;
31        }
32
33       return dp[n-1];
34    }
35}
36        