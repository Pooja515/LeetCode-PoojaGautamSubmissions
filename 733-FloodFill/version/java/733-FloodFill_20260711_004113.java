// Last updated: 11/07/2026, 00:41:13
1class Solution {
2    int[][] dir = {{-1,0},{1,0} , {0,1} , {0,-1}};
3    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
4        int original = image[sr][sc];
5        if(original == color) return image;
6        int m= image.length , n = image[0].length;
7        Queue<int[]> q = new LinkedList<>();
8        boolean[][] visited = new boolean[m][n];
9        image[sr][sc] = color;
10        q.offer(new int[] {sr,sc});
11        visited[sr][sc] =true;
12        while(!q.isEmpty()){
13            int[] cur = q.poll();
14            for(int[] d : dir){
15                int newr = cur[0] + d[0];
16                int newc = cur[1] + d[1];
17                if(newr >= 0 && newr < m && newc >= 0 && newc < n && image[newr][newc] == original && !visited[newr][newc]){
18                    visited[newr][newc] = true;
19                    image[newr][newc] = color;
20                    q.add(new int[] {newr,newc});
21                }
22            }
23        }
24        return image;
25    }
26}