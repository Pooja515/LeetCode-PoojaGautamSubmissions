// Last updated: 07/08/2026, 20:37:28
1class Solution {
2    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
3        if(image == null) return null;
4        int m = image.length , n = image[0].length;
5        int newcolor = image[sr][sc];
6
7        if(newcolor == color ) return image ;
8            
9        dfs(sr,sc,image,color,newcolor);
10
11        return image;
12    }
13
14    int[][] dir = {{-1,0},{1,0},{0,-1},{0,1}};
15
16    void dfs(int sr,int sc ,int[][] image,int color, int newcolor){
17        image[sr][sc] = color;
18        
19        for(int[] d:dir){
20
21            int newr = sr + d[0] , newc = sc + d[1];
22
23            if(newr >= 0 && newr < image.length && newc >= 0 && newc < image[0].length && image[newr][newc] == newcolor){
24                
25                dfs(newr,newc,image,color,newcolor);
26            }
27        }
28
29    }
30}