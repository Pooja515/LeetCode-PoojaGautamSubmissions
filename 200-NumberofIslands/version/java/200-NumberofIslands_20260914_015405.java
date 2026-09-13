// Last updated: 14/09/2026, 01:54:05
1class Solution {
2    int[][] dirc = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };
3    public int maxAreaOfIsland(int[][] grid) {
4      
5        if (grid == null || grid.length == 0)
6            return 0;
7        int m = grid.length, n = grid[0].length;
8
9        boolean[][] visited = new boolean[m][n];
10        int maxArea= 0;
11
12        for (int i = 0; i < m; i++) {
13            for (int j = 0; j < n; j++) {
14                if (grid[i][j] == 1 && !visited[i][j]) {
15                   maxArea = Math.max(dfs(i, j, grid, visited, m, n), maxArea);
16                   
17                }
18            }
19        }
20        return maxArea;
21
22    }
23
24    int dfs(int r, int c, int[][] grid, boolean[][] visited, int m, int n) {
25        visited[r][c] = true;
26        int island =1;
27        for (int[] dir : dirc) {
28            int newr = r + dir[0], newc = c + dir[1];
29            if (newr >= 0 && newr < m && newc >= 0 && newc < n && grid[newr][newc] == 1 && !visited[newr][newc]) {
30                island += dfs(newr, newc, grid, visited, m, n);
31            }
32        } 
33        return island; 
34    }
35}
36
37
38
39
40   
41    