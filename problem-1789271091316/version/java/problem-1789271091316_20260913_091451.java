// Last updated: 13/09/2026, 09:14:51
1class Solution {
2    public int[][] cyclicShift(int n,int[][] grid, int[] rowShift, int[] colShift) {
3      
4        int[][] shift = new int[n][n];
5
6        for (int i = 0; i < n; i++) {
7            for (int j = 0; j < n; j++) {
8                int newCol = (j - rowShift[i] + n) % n;
9                shift[i][newCol] = grid[i][j];
10            }
11        }
12        int[][] ans = new int[n][n];
13
14        for (int j = 0; j < n; j++) {
15            for (int i = 0; i < n; i++) {
16                int newRow = (i - colShift[j] + n) % n;
17                ans[newRow][j] = shift[i][j];
18            }
19        }
20
21        return ans;
22    }
23}