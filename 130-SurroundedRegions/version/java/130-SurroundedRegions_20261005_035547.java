// Last updated: 05/10/2026, 03:55:47
1class Solution {
2    public void solve(char[][] board) {
3        if(board==null || board.length ==0) return;
4        int m = board.length, n = board[0].length;
5
6        // boundary check for O'S
7        for (int r = 0; r < m; r++) {
8            if (board[r][0] == 'O') {
9                dfs(r, 0, board, m, n);
10            }
11            if (board[r][n - 1] == 'O') {
12                dfs(r, n - 1, board, m, n);
13            }
14        }
15
16         for (int c = 0; c < n; c++) {
17            if (board[0][c] == 'O') {
18                dfs(0, c, board, m, n);
19            }
20            if (board[m-1][c] == 'O') {
21                dfs(m-1, c, board, m, n);
22            }
23        }
24
25        for(int i=0;i<m;i++){
26            for(int j=0;j<n;j++){
27                if(board[i][j] == 'O'){
28                    board[i][j] ='X';
29                }
30                if(board[i][j] == 'S'){
31                    board[i][j] ='O';
32                }
33            }
34        }
35    }
36    int[][] dir={{1,0},{-1,0},{0,1},{0,-1}};
37    void dfs(int r,int c,char[][] board,int m,int n){
38        board[r][c]='S';
39
40        for(int[] d:dir){
41            int newr = r+d[0] , newc=c+d[1];
42            if(newr>=0 && newr<m && newc>=0 && newc<n && board[newr][newc] == 'O'){
43                dfs(newr,newc,board,m,n);
44            }
45        }
46
47    }
48}