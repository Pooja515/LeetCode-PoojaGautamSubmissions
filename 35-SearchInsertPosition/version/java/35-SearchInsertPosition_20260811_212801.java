// Last updated: 11/08/2026, 21:28:01
1class Solution {
2    int[][] dir = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };
3
4    public void solve(char[][] board) {
5
6        int m = board.length, n = board[0].length;
7
8        for (int i = 0; i < m; i++) {
9            if (board[i][0] == 'O') {
10                isValid(i, 0, board);
11            }
12            if (board[i][n - 1] == 'O') {
13                isValid(i, n-1, board);
14            }
15        }
16        for (int i = 0; i < n; i++) {
17            if (board[0][i] == 'O') {
18                isValid(0, i, board);
19            }
20            if (board[m-1][i] == 'O') {
21                isValid(m-1, i, board);
22            }
23        }
24
25        for (int i = 0; i < m; i++) {
26            for (int j = 0; j < n; j++) {
27                if (board[i][j] == 'O') {
28                    board[i][j] = 'X';
29                } 
30                else{
31                    if(board[i][j] == 'S'){
32                        board[i][j] = 'O';
33                    }
34                }
35            }
36        }
37    }
38
39    void isValid(int r, int c, char[][] board) {
40        board[r][c] = 'S';
41        for (int[] d : dir) {
42            int newr = r + d[0], newc = c + d[1];
43            if (newr >= 0 && newr < board.length && newc >= 0 && newc < board[0].length && board[newr][newc] == 'O') {
44                isValid(newr, newc, board);
45            }
46
47        }
48    }
49}