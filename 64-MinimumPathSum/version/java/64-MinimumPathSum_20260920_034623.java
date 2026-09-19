// Last updated: 20/09/2026, 03:46:23
1class Solution {
2
3    public int minPathSum(int[][] grid) {
4
5        if (grid == null || grid.length == 0)
6            return 0;
7        int m = grid.length, n = grid[0].length;
8
9        int[][] dp = new int[m + 1][n + 1];
10
11        for (int i = 0; i < m; i++) {
12            for (int j = 0; j < n; j++) {
13                // base case 1
14                if (i == 0 && j == 0){
15                    dp[i][j]= grid[i][j];
16                    continue;
17            }
18                // base case 2
19                if (i <0 || j < 0){
20                   dp[i][j]= (int) 1e9;
21                   continue;
22                }
23        
24
25                int up =(int) 1e9;
26                if(i>0) up = dp[i - 1][j];
27                int left = (int) 1e9;
28                if(j>0) left = dp[i][j - 1];
29
30                dp[i][j] = grid[i][j] + Math.min(up, left);
31            }
32        }
33       return dp[m-1][n-1];
34    }
35}