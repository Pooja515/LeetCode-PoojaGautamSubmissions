// Last updated: 28/06/2026, 01:04:59
class Solution {
   
    public int minPathSum(int[][] grid) {
        int m = grid.length , n = grid[0].length;
        if( m==0 || n==0) return 0;
        int[] dp = new int [n];
        
        for(int i=0; i<m ; i++){
            
            for(int j=0;j<n ; j++){
                if(i==0 && j==0){
                    dp[0] = grid[0][0];
                    continue;
                }
                int up = (int) 1e9 , left = (int) 1e9;
                if(i>0) up = dp[j] ;
                if(j>0) left = dp[j-1] ;
                dp[j] = grid[i][j] + Math.min(up,left);
            }
        }
        
        return dp[n-1] ;
    }
}