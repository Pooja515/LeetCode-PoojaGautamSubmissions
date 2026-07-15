// Last updated: 15/07/2026, 18:25:07
1class Solution {
2
3    public int minPathSum(int[][] grid) {
4        int m = grid.length, n = grid[0].length;
5
6        int[][] dp = new int[m][n];
7        for(int i=0 ;i<m ;i++){
8            for(int j =0;j<n ;j++){
9                 if (i == 0 && j == 0){
10                     dp[i][j] = grid[i][j];
11                     continue;
12                 }
13
14        int up = (int) 1e9;
15        int left = (int) 1e9;
16   
17        if (i > 0) up = dp[i - 1][j];
18        if (j > 0) left = dp[i][j - 1];
19
20        dp[i][j] = grid[i][j] + Math.min(up, left);
21            }
22        }
23      return dp[m-1][n-1];
24    }
25}