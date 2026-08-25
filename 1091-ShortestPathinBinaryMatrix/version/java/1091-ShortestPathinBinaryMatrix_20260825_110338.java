// Last updated: 25/08/2026, 11:03:38
1class Solution {
2    public int shortestPathBinaryMatrix(int[][] grid) {
3        if(grid == null || grid.length == 0) return -1;
4        int n=grid.length;
5        Queue<int[]> q=new LinkedList<>();
6        
7        if(grid[0][0] == 1 || grid[n-1][n-1] == 1) return -1;
8
9        boolean[][] visited = new boolean[n][n];
10
11        q.offer(new int[] {0,0,1});
12        visited[0][0] = true;
13
14      int[][] directions ={{-1,0},{1,0},{0,-1},{0,1},{-1,-1},{-1,1},{1,1},{1,-1}};
15      while(!q.isEmpty()){
16        int[] curr  = q.poll();
17        int r = curr[0] , c = curr[1], dist = curr[2];
18          if(r == n-1 && c ==n-1) return dist;
19        for(int[] d:directions){
20            
21              int newr = r +d[0] , newc= c+d[1];
22              if(newr >=0 && newr<n && newc>=0 && newc < n && grid[newr][newc] == 0 && !visited[newr][newc] ){
23                visited[newr][newc] = true;
24                q.offer(new int[] {newr , newc ,dist+1});
25              }
26        }
27      
28      }
29      return -1;
30       
31    }
32}