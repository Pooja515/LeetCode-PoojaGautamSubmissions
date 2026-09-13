// Last updated: 14/09/2026, 02:32:24
1class Solution {
2    int[][] dir = {{-1,0},{1,0},{0,-1},{0,1}};
3    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
4       int originalcolor = image[sr][sc];
5       if(originalcolor == color) return image;
6       dfs(sr,sc,image,color,originalcolor);
7
8       return image;
9    }
10    void dfs(int r , int c, int[][] image , int color , int originalcolor){
11        image[r][c] = color;
12        for(int[] d : dir){
13            int newr = r+d[0] , newc=c+d[1];
14            if(newr >= 0 && newr < image.length && newc >= 0 && newc < image[0].length && image[newr][newc] == originalcolor){
15                dfs(newr,newc,image,color,originalcolor);
16            }
17        }
18    }
19}