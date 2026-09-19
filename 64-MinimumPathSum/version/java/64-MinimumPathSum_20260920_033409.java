// Last updated: 20/09/2026, 03:34:09
1class Solution {
2    int[][] memo;
3    public int minPathSum(int[][] grid) {
4
5        if (grid == null || grid.length == 0)
6            return 0;
7        int m = grid.length, n = grid[0].length;
8
9        memo = new int[m][n];
10        for(int[] rows : memo){
11            Arrays.fill(rows,(int) 1e9);
12        }
13
14        return f(m - 1, n - 1, grid);
15
16    }
17
18    int f(int i, int j, int[][] grid) {
19
20        // base case 1
21        if (i == 0 && j == 0)
22            return grid[i][j];
23        // base case 2
24        if (i < 0 || j < 0)
25            return (int) 1e9;
26        
27        if(memo[i][j] != (int) 1e9) return memo[i][j];
28
29        int up = f(i - 1, j, grid);
30        int left = f(i, j - 1, grid);
31
32        return memo[i][j] =grid[i][j] + Math.min(up, left);
33    }
34}