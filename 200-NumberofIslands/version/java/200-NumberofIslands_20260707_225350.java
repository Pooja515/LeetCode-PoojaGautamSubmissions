// Last updated: 07/07/2026, 22:53:50
1class Solution {
2    int[][] dir = {{-1,0}, {1,0},{0,-1} ,{0,1}};
3    public int numIslands(char[][] grid) {
4        int m = grid.length , n= grid[0].length;
5        boolean[][] visited = new boolean [m][n];
6        int island = 0;
7        for(int i=0;i<m;i++){
8            for(int j=0;j<n;j++){
9                if(grid[i][j] == '1' && !visited[i][j])
10                {
11                    visited[i][j] = true;
12                    dfs(i,j,grid,visited,m,n);
13                    island++;
14                }
15                else
16                      continue;
17               
18            }
19        }
20        return island;
21    }
22    void dfs(int i , int j ,char[][] grid , boolean[][] visited , int m , int n){
23     
24        for(int[] d : dir){
25            int newr = i+d[0] , newc = j+d[1];
26            if(newr >= 0 && newr < m && newc >=0 && newc < n && grid[newr][newc] == '1' && !visited[newr][newc]){
27                visited[newr][newc] = true;
28                dfs(newr,newc,grid,visited,m,n);
29
30            } 
31        }
32    }
33}