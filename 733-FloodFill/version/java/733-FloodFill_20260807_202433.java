// Last updated: 07/08/2026, 20:24:33
1class Solution {
2    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
3        if(image == null) return null;
4
5        int m = image.length , n = image[0].length;
6
7        int newcolor = image[sr][sc];
8
9        if(newcolor == color ) return image ;
10
11        //newcolor = color;
12            
13        dfs(sr,sc,image,color,newcolor);
14
15        return image;
16    }
17
18    int[][] dir = {{-1,0},{1,0},{0,-1},{0,1}};
19
20    void dfs(int sr,int sc ,int[][] image,int color, int newcolor){
21        image[sr][sc] = color;
22        
23        for(int[] d:dir){
24            int newr = sr + d[0] , newc = sc + d[1];
25            if(newr >= 0 && newr < image.length && newc >= 0 && newc < image[0].length && image[newr][newc] == newcolor){
26                //image[newr][newc] = color;
27                dfs(newr,newc,image,color,newcolor);
28            }
29        }
30
31    }
32}