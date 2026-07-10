// Last updated: 11/07/2026, 01:55:35
1class Solution {
2    int[][] dir = {{-1,0},{1,0} , {0,1} , {0,-1}};
3    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
4        int original = image[sr][sc];
5        if(original == color) return image;
6        int m= image.length , n = image[0].length;
7        Queue<int[]> q = new LinkedList<>();
8        image[sr][sc] = color;
9        q.offer(new int[] {sr,sc});
10       
11        while(!q.isEmpty()){
12            int[] cur = q.poll();
13            for(int[] d : dir){
14                int newr = cur[0] + d[0];
15                int newc = cur[1] + d[1];
16                if(newr >= 0 && newr < m && newc >= 0 && newc < n && image[newr][newc] == original ){
17                   
18                    image[newr][newc] = color;
19                    q.add(new int[] {newr,newc});
20                }
21            }
22        }
23        return image;
24    }
25}