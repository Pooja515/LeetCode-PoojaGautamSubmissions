// Last updated: 28/06/2026, 01:02:44
class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int originalColor = image[sr][sc];
        if(originalColor==color) return image;
        dfs(sr,sc,color,originalColor,image);
       
        return image;
    }
    int[][] directions={{-1,0},{1,0},{0,-1},{0,1}};
    void dfs(int sr,int sc,int color,int originalColor,int[][] image){
        int m=image.length,n=image[0].length;
        image[sr][sc]=color;
        for(int[] dir:directions){
            int newr=sr+dir[0],newc=sc+dir[1];
            if(newr>=0 && newr<m && newc>=0 && newc<n &&  image[newr][newc]==originalColor ){
                  dfs(newr,newc,color,originalColor,image);

            }
        }
    }
}