// Last updated: 28/06/2026, 01:04:58
class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m= obstacleGrid.length , n= obstacleGrid[0].length;
        if(m == 0 || n == 0) return 0;
        if(obstacleGrid[0][0] == 1 || obstacleGrid[m-1][n-1] == 1) return  0;

        int[] dp = new int[n];
       
        for(int i=0 ; i<m ; i++){
            for(int j=0;j<n ; j++){
                if(i==0 && j==0){
                     dp[0]= 1;
                     continue;
                }
                if(obstacleGrid[i][j] == 1) {
                      dp[j] = 0;
                      continue;
                }
                      

                int up = 0, left = 0;
                   if(i>0)  up = dp[j];
                   if(j>0)  left = dp[j-1];
                   dp[j] = up + left;
                   
            }
        }
     return dp[n-1];
    }
}