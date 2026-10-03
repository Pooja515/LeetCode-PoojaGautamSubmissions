// Last updated: 04/10/2026, 02:49:06
1class Solution {
2    int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
3
4    public int numIslands(char[][] grid) {
5        int m = grid.length , n= grid[0].length;
6        int island =0;
7
8        boolean[][] visited = new boolean[m][n];
9
10        for(int r=0;r<m;r++){
11            for(int c=0;c<n;c++){
12                if(!visited[r][c] && grid[r][c] == '1'){
13                    dfs(r,c,grid,visited,m,n);
14                    island++;
15                }
16            }
17        }
18        return island;
19    }
20
21    void dfs(int r,int c,char[][] grid,boolean[][] visited , int m,int n ){
22        visited[r][c] =true;
23        for(int[] d:dir){
24            int newr = r+d[0] , newc = c+d[1];
25            if(newr >=0 && newr<m && newc>=0 && newc<n && !visited[newr][newc] && grid[newr][newc] == '1'){
26                dfs(newr,newc,grid,visited,m,n);
27            }
28        }
29    }
30}