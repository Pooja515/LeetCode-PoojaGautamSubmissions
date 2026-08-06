// Last updated: 07/08/2026, 00:16:12
1class Solution {
2    public int numIslands(char[][] grid) {
3        if (grid == null || grid.length == 0)
4            return 0;
5        int m = grid.length, n = grid[0].length, island = 0;
6        boolean[][] visited = new boolean[m][n];
7        for (int r = 0; r < m; r++) {
8            for (int c = 0; c < n; c++) {
9                if (grid[r][c] == '1' && !visited[r][c]) {
10                    dfs(r, c, grid, visited);
11                    island++;
12
13                }
14            }
15        }
16        return island;
17    }
18
19    int[][] dir = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };
20
21    void dfs(int r, int c, char[][] grid, boolean[][] visited) {
22        visited[r][c] = true;
23        for (int[] d : dir) { // explore neighbors
24            int newr = r + d[0], newc = c + d[1];
25            if (newr >= 0 && newr < grid.length && newc >= 0 && newc < grid[0].length && grid[newr][newc] == '1'
26                    && !visited[newr][newc]) {
27                dfs(newr, newc, grid, visited);
28            }
29        }
30
31    }
32}