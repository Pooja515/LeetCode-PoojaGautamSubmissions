// Last updated: 20/10/2026, 15:46:58
1class Solution {
2    public int uniquePaths(int m, int n) {
3       int[][] dp = new int[m][n];
4
5       for(int i=0;i<m;i++){
6        for(int j=0;j<n;j++){
7            if(i==0 || j==0){
8                dp[i][j]=1;
9                continue;
10            }
11
12            int left = dp[i-1][j];
13            int up = dp[i][j-1];
14
15            dp[i][j] =left + up;
16
17        }
18       } 
19       return dp[m-1][n-1];
20    }
21}