// Last updated: 04/10/2026, 18:07:48
1class Solution {
2    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
3      int m = image.length , n= image[0].length;
4
5      int original = image[sr][sc];
6      if(original == color) return image;
7
8
9      dfs(sr,sc,image,original,color,m,n);
10
11      return image;
12    }
13    int[][] dir ={{-1,0},{1,0},{0,1},{0,-1}};
14
15    void dfs(int r,int c,int[][] image , int original,int color,int m,int n){
16        image[r][c] = color;
17
18        for(int[] d:dir){
19            int newr = r+d[0] , newc = c+d[1];
20            if(newr >= 0 && newr<m && newc>=0 && newc<n && image[newr][newc] == original){
21                dfs(newr,newc,image,original,color,m,n);
22            }
23        }
24
25    }
26}