// Last updated: 13/11/2026, 14:44:01
1class Solution {
2    public int numIslands(char[][] grid) {
3        int m = grid.length, n = grid[0].length;
4
5        int island = 0;
6        boolean[][] visited = new boolean[m][n];
7        for (int i = 0; i < m; i++) {
8            for (int j = 0; j < n; j++) {
9                if (grid[i][j] == '1' && !visited[i][j]) {
10                    dfs(i, j, grid, visited);
11                    island++;
12                }
13            }
14        }
15        return island;
16    }
17
18    int[][] dir = { { -1, 0 }, { 1, 0 }, { 0, 1 }, { 0, -1 } };
19
20    void dfs(int r,int c,char[][] grid,boolean[][] visited){
21        visited[r][c]=true;
22
23        for(int[] d:dir){
24            int newr = r+d[0] , newc=c+d[1];
25            if(newr >= 0 && newr < grid.length && newc >= 0 && newc < grid[0].length && grid[newr][newc] == '1' && !visited[newr][newc]){
26                dfs(newr,newc,grid,visited);
27              
28            }
29        }
30
31    }
32}