// Last updated: 10/08/2026, 18:42:48
1class Solution {
2   int[][] dir = { { -1, 0 }, { 1, 0 }, { 0, 1 }, { 0, -1 } };
3
4
5   public int orangesRotting(int[][] grid) {
6       if (grid == null || grid[0].length == 0)
7           return 0;
8       int m = grid.length, n = grid[0].length;
9       int fresh = 0;
10       Queue<int[]> q = new ArrayDeque<>();
11       for (int r = 0; r < m; r++) {
12           for (int c = 0; c < n; c++) {
13               if (grid[r][c] == 2) {
14                   q.offer(new int[] { r, c });
15               } else {
16                   if (grid[r][c] == 1)
17                       fresh++;
18               }
19           }
20       }
21       if(fresh == 0) return 0;
22       int minutes = 0;
23       while (!q.isEmpty() && fresh > 0) {
24           int len = q.size();
25           for (int i = 0; i < len; i++) {
26               int[] cur = q.poll();
27
28
29               for (int[] d : dir) {
30                   int newr = cur[0] + d[0];
31                   int newc = cur[1] + d[1];
32                   if (newr >= 0 && newr < m && newc >= 0 && newc < n && grid[newr][newc] == 1) {
33                       fresh--;
34
35
36                       grid[newr][newc] = 2;
37                       q.offer(new int[] { newr, newc });
38                   }
39               }
40           }
41           minutes++;
42       }
43       return fresh == 0 ? minutes : -1;
44   }
45}
46