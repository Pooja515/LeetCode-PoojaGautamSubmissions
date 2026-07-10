// Last updated: 10/07/2026, 16:15:58
1class Solution {
2    int[][] dirs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
3    public int maxAreaOfIsland(int[][] grid) {
4        if(grid == null || grid[0].length == 0) return 0;
5        int m = grid.length , n = grid[0].length;
6        boolean[][] visited = new boolean[m][n];
7         int maxArea = 0;
8        for(int r = 0 ;r<m;r++){
9            for(int c=0;c<n;c++){
10                if(grid[r][c] == 1 && !visited[r][c] ){
11                    maxArea = Math.max(maxArea , bfs(r,c,grid,visited));
12                }
13            }
14        }
15        return maxArea;
16    }
17    int bfs(int r , int c , int[][] grid , boolean[][] visited){
18        int m = grid.length , n = grid[0].length;
19        int area = 1;
20
21        Queue<int[]> q = new ArrayDeque<>();
22        q.offer(new int[] {r,c});
23        visited[r][c] = true;
24
25        while(!q.isEmpty()){
26            int[] cur = q.poll();
27            for(int[] d : dirs){
28                int newr =cur[0] + d[0] ,newc = cur[1] + d[1];
29        
30                if(newr >= 0 && newr < m && newc >= 0 && newc < n && grid[newr][newc] == 1 && !visited[newr][newc] ){
31                 visited[newr][newc] = true;
32                 q.offer(new int[] {newr , newc});
33                 area++;
34                
35                }
36            }
37           
38        }
39        return area;
40    }
41}