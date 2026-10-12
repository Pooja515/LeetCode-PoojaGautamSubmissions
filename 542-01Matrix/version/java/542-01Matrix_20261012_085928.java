// Last updated: 12/10/2026, 08:59:28
1class Solution {
2    public int[][] updateMatrix(int[][] mat) {
3        int m = mat.length, n = mat[0].length;
4
5        Queue<int[]> q = new LinkedList<>();
6
7        for (int r = 0; r < m; r++) {
8            for (int c = 0; c < n; c++) {
9                if (mat[r][c] == 0) {
10                    q.offer(new int[] { r, c });
11                } else {
12                    mat[r][c] = -1;
13                }
14            }
15        }
16        int[][] dir = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };
17      
18        while (!q.isEmpty()) {
19             int[] cur = q.poll();
20             int r = cur[0], c = cur[1];
21               
22                for (int[] d : dir) {
23                    int newr = r + d[0], newc = c + d[1];
24                    if (newr >= 0 && newr < m && newc >= 0 && newc < n && mat[newr][newc] == -1) {
25                        mat[newr][newc] = 1 + mat[r][c];
26                        q.offer(new int[] { newr, newc });
27                    }
28                }
29
30        }
31        return mat;
32    }
33}