// Last updated: 08/07/2026, 16:41:40
1class Solution {
2    int[][] dir = {{-1,0},{1,0} , {0,-1},{0,1}};
3    public int maxAreaOfIsland(int[][] grid) {
4        int maxArea = 0;
5        int m = grid.length , n = grid[0].length;
6        if(grid == null || m==0) return 0;
7        boolean[][] visited = new boolean[m][n];
8        for(int r=0;r<m;r++){
9            for(int c=0;c<n;c++){
10                 if(grid[r][c] == 1 && !visited[r][c]){
11                    maxArea = Math.max(maxArea , dfs(r,c,grid,visited,m,n));
12                 } 
13            }
14        }
15        return maxArea;
16    }
17    int dfs(int r,int c,int[][] grid , boolean[][] visited ,int m ,int n){
18        int area =1;
19        visited[r][c] = true;
20        for(int[] d : dir){
21            int newr = r + d[0] , newc = c + d[1];
22            if(newr >= 0 && newr <m && newc >= 0 && newc <n && grid[newr][newc] == 1 && !visited[newr][newc]){
23                area += dfs(newr , newc , grid, visited , m , n);
24            }
25        }
26        return area;
27    }
28}