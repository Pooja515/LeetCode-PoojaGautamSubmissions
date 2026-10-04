// Last updated: 04/10/2026, 23:03:03
1class Solution {
2    int[][] dir = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };
3
4    public int numEnclaves(int[][] grid) {
5        int m = grid.length, n = grid[0].length;
6
7        // lets do boundary check
8        for (int r = 0; r < m; r++) {
9            if (grid[r][0] == 1) {
10                dfs(r, 0, grid, m, n);
11            }
12            if (grid[r][n - 1] == 1) {
13                dfs(r, n - 1, grid, m, n);
14            }
15
16        }
17
18        for (int c = 0; c < n; c++) {
19            if (grid[0][c] == 1) {
20                dfs(0, c, grid, m, n);
21            }
22
23            if (grid[m - 1][c] == 1) {
24                dfs(m - 1, c, grid, m, n);
25            }
26        }
27
28        int cnt = 0;
29        for (int i = 0; i < m; i++) {
30            for (int j = 0; j < n; j++) {
31                if (grid[i][j] == 1)
32                    cnt++;
33            }
34        }
35
36        return cnt;
37    }
38
39    void dfs(int r, int c, int[][] grid, int m, int n) {
40        grid[r][c] = -1;
41        for (int[] d : dir) {
42            int newr = r + d[0], newc = c + d[1];
43            if (newr >= 0 && newr < m && newc >= 0 && newc < n && grid[newr][newc] == 1) {
44                dfs(newr, newc, grid, m, n);
45            }
46        }
47    }
48}