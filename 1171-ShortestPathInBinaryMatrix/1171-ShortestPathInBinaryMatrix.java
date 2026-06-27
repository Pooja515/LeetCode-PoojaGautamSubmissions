// Last updated: 28/06/2026, 01:02:14
class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n=grid.length;
        if(grid[0][0]==1 || grid[n-1][n-1]==1) return -1;
        Queue<int[]> q=new LinkedList<>();
        boolean[][] visited=new boolean[n][n];
        q.offer(new int[] {0,0,1});
        visited[0][0]=true;
           
        int[][] directions ={{-1,0},{1,0},{0,-1},{0,1},{-1,-1},{-1,1},{1,1},{1,-1}};
        while(!q.isEmpty()){
            int[] cell=q.poll();
            int r=cell[0],c=cell[1],dist=cell[2];
            if(r==n-1 &&  c==n-1) return dist;
            for(int[] d: directions){
                int newr=r+d[0] ,newc=c+d[1];
                if(newr>=0 && newr<n && newc>=0 && newc<n && grid[newr][newc]==0 && !visited[newr][newc]){
                    visited[newr][newc]=true;
                    q.offer(new int[] {newr,newc,dist+1});
                }
            }
        }
return -1;
    }
}