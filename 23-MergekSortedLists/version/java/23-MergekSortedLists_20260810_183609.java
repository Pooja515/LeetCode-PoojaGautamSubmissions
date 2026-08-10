// Last updated: 10/08/2026, 18:36:09
1class Solution {
2    public int orangesRotting(int[][] grid) {
3        if(grid== null || grid.length ==0) return 0;
4
5        int m = grid.length, n = grid[0].length;
6    
7        Queue<int[]> q = new LinkedList<>();
8        int fresh = 0;
9
10        for (int r = 0; r < m; r++) {
11            for (int c = 0; c < n; c++) {
12                if (grid[r][c] == 2 ) {
13                    q.offer(new int[] { r, c });
14                } else {
15                    if (grid[r][c] == 1)
16                        fresh++;
17                }
18            }
19        }
20        if(fresh == 0) return 0;
21        int[][] dir = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };
22        int minute =0;
23        while (!q.isEmpty() && fresh > 0) {
24             int size = q.size();
25             minute ++;
26            for (int i = 0; i < size; i++) {
27                int[] curr = q.poll();
28                for (int[] d : dir) {
29                    int newr = curr[0] + d[0], newc = curr[1] + d[1];
30                    if (newr >= 0 && newr < m && newc >= 0 && newc < n && grid[newr][newc] == 1) {
31                        grid[newr][newc] = 2;
32                        q.offer(new int[] { newr, newc });
33                        fresh--;
34                    }
35                }
36
37            }
38
39        }
40
41        return (fresh == 0 ? minute : -1);
42
43    }
44}