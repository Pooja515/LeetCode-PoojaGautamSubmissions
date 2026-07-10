// Last updated: 11/07/2026, 02:17:48
1class Solution {
2    int[][] dir = {{-1,0},{1,0} , {0,1} , {0,-1}};
3    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
4        int original = image[sr][sc];
5        if(original == color) return image;
6        int m= image.length , n = image[0].length;
7        dfs(sr,sc,image,color,original);
8        return image;
9    }
10    void dfs(int sr, int sc , int[][] image , int color , int original){
11         int m= image.length , n = image[0].length;
12            image[sr][sc] = color;
13      
14            for(int[] d : dir){
15                int newr = sr + d[0];
16                int newc = sc + d[1];
17                if(newr >= 0 && newr < m && newc >= 0 && newc < n && image[newr][newc] == original ){
18                   
19                     dfs(newr,newc,image,color,original);
20                    
21                }
22            }
23        }
24    }
25