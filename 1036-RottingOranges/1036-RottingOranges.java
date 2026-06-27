// Last updated: 28/06/2026, 01:02:18
class Solution {
    public int orangesRotting(int[][] grid) {
        int rows=grid.length,cols=grid[0].length;
        int fresh=0, minutes=0;
        Queue<int[]> q =new LinkedList<>();
        for(int r=0;r<rows;r++){
            for(int c=0;c<cols;c++){
                if(grid[r][c]==2)
                      q.offer(new int[] {r,c});
                if(grid[r][c]==1) 
                      fresh++;
                
            }
        }
        int[][] directions={{-1,0},{1,0},{0,-1},{0,1}};
        while(!q.isEmpty() && fresh>0){
            minutes++;
            int n=q.size();
            for(int i=0;i<n;i++){
            int[] cell =q.poll();
            int row=cell[0];
            int col=cell[1];
            for(int[] d:directions){
                int newr=row+d[0];
                int newc=col+d[1];
                if(newr>=0 && newr<rows && newc>=0 && newc<cols && grid[newr][newc]==1){
                    grid[newr][newc]=2;
                    fresh--;
                    q.offer(new int[] {newr,newc});
                }
            }
            
            }
          

        }
        return fresh==0?minutes:-1;
    }
}