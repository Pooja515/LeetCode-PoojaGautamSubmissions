// Last updated: 12/07/2026, 17:32:23
1class Solution {
2    public int orangesRotting(int[][] grid) {
3        if (grid == null || grid.length == 0)
4            return 0;
5
6        int m = grid.length, n = grid[0].length;
7
8        Queue<int[]> q = new LinkedList<>();
9
10        int minutes = 0, fresh = 0;
11        for (int r = 0; r < m; r++) {
12            for (int c = 0; c < n; c++) {
13                if (grid[r][c] == 2) {
14                    q.offer(new int[] { r, c });
15                } else {
16                    if (grid[r][c] == 1)
17                        fresh++;
18                }
19            }
20        }
21        int[][] dirs = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };
22        while (!q.isEmpty() && fresh > 0) {
23            int size = q.size();
24            for (int i = 0; i < size; i++) {
25                int[] cur = q.poll();
26
27                for (int[] d : dirs) {
28                    int newr = d[0] + cur[0];
29                    int newc = d[1] + cur[1];
30
31                    if (newr >= 0 && newr < m && newc >= 0 && newc < n && grid[newr][newc] == 1) {
32                        fresh--;
33                        grid[newr][newc] = 2;
34                        q.offer(new int[] { newr, newc });
35                    }
36                }
37
38            }
39            minutes++;
40        }
41        return fresh == 0 ? minutes : -1;
42    }
43}