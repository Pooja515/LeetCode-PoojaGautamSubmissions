// Last updated: 14/09/2026, 00:27:48
1class Solution {
2    int[][] dirc = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };
3
4    public int numIslands(char[][] grid) {
5        if (grid == null || grid.length == 0)
6            return 0;
7        int m = grid.length, n = grid[0].length;
8
9        boolean[][] visited = new boolean[m][n];
10        int island = 0;
11        for (int i = 0; i < m; i++) {
12            for (int j = 0; j < n; j++) {
13                if (grid[i][j] == '1' && !visited[i][j]) {
14                    dfs(i, j, grid, visited, m, n);
15                    island++;
16                }
17            }
18        }
19        return island;
20
21    }
22
23    void dfs(int r, int c, char[][] grid, boolean[][] visited, int m, int n) {
24        visited[r][c] = true;
25        for (int[] dir : dirc) {
26            int newr = r + dir[0], newc = c + dir[1];
27            if (newr >= 0 && newr < m && newc >= 0 && newc < n && grid[newr][newc] == '1' && !visited[newr][newc]) {
28                dfs(newr, newc, grid, visited, m, n);
29            }
30        }
31    }
32}