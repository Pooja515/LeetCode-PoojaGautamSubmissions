// Last updated: 25/08/2026, 11:23:33
1class Solution {
2    public int shortestPathBinaryMatrix(int[][] grid) {
3        if(grid == null || grid.length == 0) return -1;
4        int n=grid.length;
5        Queue<int[]> q=new LinkedList<>();
6        
7        if(grid[0][0] == 1 || grid[n-1][n-1] == 1) return -1;
8
9      
10        q.offer(new int[] {0,0,1});
11        grid[0][0]=1;
12
13      int[][] directions ={{-1,0},{1,0},{0,-1},{0,1},{-1,-1},{-1,1},{1,1},{1,-1}};
14      while(!q.isEmpty()){
15        int[] curr  = q.poll();
16        int r = curr[0] , c = curr[1], dist = curr[2];
17        if(r == n-1 && c ==n-1) return dist;
18        for(int[] d:directions){
19            
20              int newr = r +d[0] , newc= c+d[1];
21              if(newr >=0 && newr<n && newc>=0 && newc < n && grid[newr][newc] == 0 ){
22                grid[newr][newc] = 1;
23                q.offer(new int[] {newr , newc ,dist+1});
24              }
25        }
26      
27      }
28      return -1;
29       
30    }
31}