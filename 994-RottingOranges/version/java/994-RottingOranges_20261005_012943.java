// Last updated: 05/10/2026, 01:29:43
1class Solution {
2    public int orangesRotting(int[][] grid) {
3        if (grid == null || grid.length == 0)
4            return 0;
5        int m = grid.length, n = grid[0].length;
6        int fresh = 0;
7        Queue<int[]> q = new LinkedList<>();
8
9        for (int r = 0; r < m; r++) {
10            for (int c = 0; c < n; c++) {
11                if (grid[r][c] == 2) {
12                    q.offer(new int[] { r, c });
13                } else {
14                    if (grid[r][c] == 1)
15                        fresh++;
16                }
17            }
18        }
19
20        if (fresh == 0)
21            return 0;
22
23        int minute = 0;
24        int[][] dir = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };
25
26        while (!q.isEmpty() && fresh > 0) {
27            int size = q.size();
28            minute++;
29
30            for (int i = 0; i < size; i++) {
31                int[] cur = q.poll();
32                int r = cur[0], c = cur[1];
33                for (int[] d : dir) {
34                    int newr = r + d[0], newc = c + d[1];
35                    if (newr >= 0 && newr < m && newc >= 0 && newc < n && grid[newr][newc] == 1) {
36                        grid[newr][newc] = 2;
37                        fresh--;
38                        q.offer(new int[] { newr, newc });
39                    }
40                }
41            }
42
43        }
44        return fresh == 0 ? minute : -1;
45
46    }
47}