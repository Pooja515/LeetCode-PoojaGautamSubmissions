// Last updated: 28/06/2026, 01:02:48
class Solution {
    int maxarea=0;
    public int maxAreaOfIsland(int[][] grid) {
        int m =grid.length, n =grid[0].length;
        if(m==0 ) return 0;
        boolean[][] visited=new boolean[m][n];
        int island=0;
        for(int r=0;r<m;r++){
            for(int c=0;c<n;c++){
                if(grid[r][c]== 1 && !visited[r][c]){
                    maxarea=Math.max(maxarea,dfs(r,c,grid,visited));

                }
            }
        }
        return maxarea;
        
    }
    int[][] dir={{-1,0},{1,0},{0,-1},{0,1}};
    int dfs(int r,int c,int[][] grid ,boolean[][] visited){
         int m= grid.length,n=grid[0].length;
         visited[r][c]=true;
          int area=1;
         for(int[] d: dir){
         int newr= r+d[0], newc= c+d[1];
            if(newr>=0 && newr<m && newc>=0 && newc<n && grid[newr][newc] == 1 && !visited[newr][newc]){
                area += dfs(newr,newc,grid,visited);
                
               
            }
        }
        return area;
    }
}