// Last updated: 14/09/2026, 13:28:08
1class Solution {
2    int[][] dir = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };
3
4    public int orangesRotting(int[][] grid) {
5        int m = grid.length, n = grid[0].length, fresh = 0;
6
7        Queue<int[]> q = new LinkedList<>();
8
9        for (int r = 0; r < m; r++) {
10            for (int c = 0; c < n; c++) {
11                if (grid[r][c] == 2) {
12                    q.offer(new int[] { r, c });
13                } else {
14                    if (grid[r][c] == 1) {
15                        fresh++;
16                    }
17                }
18            }
19
20        }
21        if (fresh == 0)
22            return 0;
23        int minute = 0;
24        while (!q.isEmpty() && fresh>0) {
25            int size = q.size();
26            minute++;
27            for (int i = 0; i < size; i++) {
28                int[] curr = q.poll();
29                int r = curr[0], c = curr[1];
30                for (int[] d : dir) {
31                    int newr = r + d[0], newc = c + d[1];
32                    if (newr >= 0 && newr < m && newc >= 0 && newc < n && grid[newr][newc] == 1) {
33                        grid[newr][newc] = 2;
34                        q.offer(new int[] { newr, newc });
35                        fresh--;
36                    }
37                }
38            }
39        }
40
41        return fresh == 0 ? minute : -1;
42
43    }
44}