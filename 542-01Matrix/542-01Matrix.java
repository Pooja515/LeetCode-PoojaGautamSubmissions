// Last updated: 28/06/2026, 01:02:56
class Solution {
    public int[][] updateMatrix(int[][] mat) {
        if(mat==null || mat.length==0) return mat;
        Queue<int[]> q=new LinkedList<>();
        int rows=mat.length,cols=mat[0].length;
        int distance=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(mat[i][j]==0) q.offer(new int[] {i,j});
                else
                         mat[i][j]=-1;
            }
        }
        int[][] directions={{-1,0},{1,0},{0,-1},{0,1}};
        while(!q.isEmpty()){
                int[] cell=q.poll();
                int r=cell[0];
                int c=cell[1];
                for(int[] d:directions){
                    int newr=r+d[0];
                    int newc=c+d[1];
                    if(newr>=0 && newr<rows && newc>=0 && newc<cols && mat[newr][newc]==-1){
                            mat[newr][newc]=mat[r][c] +1;
                            q.offer(new int[] {newr,newc});
                       }
                    }
                }
            
            return mat;
        }
    
}