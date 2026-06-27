// Last updated: 28/06/2026, 01:05:00
class Solution {
    public int uniquePaths(int m, int n) {
        if(m == 0 || n == 0) return 0;
        int[] dp = new int[n];
       // Arrays.fill(dp,1);
        for(int i=0 ; i<m;i++){
            for(int j=0 ; j<n;j++){
                if(i == 0 && j==0){
                     dp[0] = 1;
                     continue;
                }
            int up = 0,left=0;
            if(i>0) up = dp[j];
            if(j>0) left = dp[j-1];

            dp[j] = up + left;
            }
        }

       return dp[n-1];
    }
}