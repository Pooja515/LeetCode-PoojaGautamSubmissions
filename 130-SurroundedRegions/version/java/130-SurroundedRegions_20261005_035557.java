// Last updated: 05/10/2026, 03:55:57
1class Solution {
2    public void solve(char[][] board) {
3        if (board == null || board.length == 0)
4            return;
5        int m = board.length, n = board[0].length;
6
7        // boundary check for O'S
8        for (int r = 0; r < m; r++) {
9            if (board[r][0] == 'O') {
10                dfs(r, 0, board, m, n);
11            }
12            if (board[r][n - 1] == 'O') {
13                dfs(r, n - 1, board, m, n);
14            }
15        }
16
17        for (int c = 0; c < n; c++) {
18            if (board[0][c] == 'O') {
19                dfs(0, c, board, m, n);
20            }
21            if (board[m - 1][c] == 'O') {
22                dfs(m - 1, c, board, m, n);
23            }
24        }
25
26        for (int i = 0; i < m; i++) {
27            for (int j = 0; j < n; j++) {
28                if (board[i][j] == 'O') {
29                    board[i][j] = 'X';
30                }
31                if (board[i][j] == 'S') {
32                    board[i][j] = 'O';
33                }
34            }
35        }
36    }
37
38    int[][] dir = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };
39
40    void dfs(int r, int c, char[][] board, int m, int n) {
41        board[r][c] = 'S';
42
43        for (int[] d : dir) {
44            int newr = r + d[0], newc = c + d[1];
45            if (newr >= 0 && newr < m && newc >= 0 && newc < n && board[newr][newc] == 'O') {
46                dfs(newr, newc, board, m, n);
47            }
48        }
49
50    }
51}