// Last updated: 20/09/2026, 03:50:29
1class Solution {
2
3    public int minPathSum(int[][] grid) {
4
5        if (grid == null || grid.length == 0)
6            return 0;
7        int m = grid.length, n = grid[0].length;
8
9        int[] dp = new int [n ];
10
11        for (int i = 0; i < m; i++) {
12           
13            for (int j = 0; j < n; j++) {
14                // base case 1
15                if (i == 0 && j == 0){
16                    dp[j]= grid[i][j];
17                    continue;
18            }
19                // base case 2
20                if (i <0 || j < 0){
21                   dp[j]= (int) 1e9;
22                   continue;
23                }
24        
25
26                int up =(int) 1e9;
27                if(i>0) up = dp[j];
28                int left = (int) 1e9;
29                if(j>0) left = dp[j - 1];
30
31                dp[j] = grid[i][j] + Math.min(up, left);
32            }
33           
34        }
35       return dp[n-1];
36    }
37}