// Last updated: 15/07/2026, 18:01:48
1class Solution {
2    int[][] memo;
3    public int minPathSum(int[][] grid) {
4        int m = grid.length, n = grid[0].length;
5        
6        memo = new int[m][n];
7        for(int[] r : memo) {
8            Arrays.fill(r , -1);
9        }
10        return f(m - 1, n - 1, grid);
11    }
12
13    int f(int i, int j, int[][] grid) {
14        if (i == 0 && j == 0)
15            return grid[i][j];
16        if (i < 0 || j < 0)
17            return (int) 1e9;
18
19        int up = (int) 1e9;
20        int left = (int) 1e9;
21        if(memo[i][j] != -1) return memo[i][j];
22        if (i > 0)
23            up = f(i - 1, j, grid);
24        if (j > 0)
25            left = f(i, j - 1, grid);
26
27        return memo[i][j] =  grid[i][j] + Math.min(up, left);
28    }
29}