// Last updated: 11/07/2026, 02:59:28
1class Solution {
2    int[][] dir = { { -1, 0 }, { 1, 0 }, { 0, 1 }, { 0, -1 } };
3
4    public int orangesRotting(int[][] grid) {
5        if (grid == null || grid[0].length == 0)
6            return 0;
7        int m = grid.length, n = grid[0].length;
8        int fresh = 0;
9        Queue<int[]> q = new ArrayDeque<>();
10        for (int r = 0; r < m; r++) {
11            for (int c = 0; c < n; c++) {
12                if (grid[r][c] == 2) {
13                    q.offer(new int[] { r, c });
14                } else {
15                    if (grid[r][c] == 1)
16                        fresh++;
17                }
18            }
19        }
20        int minutes = 0;
21        while (!q.isEmpty() && fresh > 0) {
22            int len = q.size();
23            for (int i = 0; i < len; i++) {
24                int[] cur = q.poll();
25
26                for (int[] d : dir) {
27                    int newr = cur[0] + d[0];
28                    int newc = cur[1] + d[1];
29                    if (newr >= 0 && newr < m && newc >= 0 && newc < n && grid[newr][newc] == 1) {
30                        fresh--;
31
32                        grid[newr][newc] = 2;
33                        q.offer(new int[] { newr, newc });
34                    }
35                }
36            }
37            minutes++;
38        }
39        return fresh == 0 ? minutes : -1;
40    }
41}