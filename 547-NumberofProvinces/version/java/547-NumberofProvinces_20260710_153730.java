// Last updated: 10/07/2026, 15:37:30
1class Solution {
2    int[][] dir = {{-1,0}, {1,0},{0,-1} ,{0,1}};
3    public int numIslands(char[][] grid) {
4        int m = grid.length , n= grid[0].length;
5        boolean[][] visited = new boolean [m][n];
6        int island = 0;
7        for(int i=0;i<m;i++){
8            for(int j=0;j<n;j++){
9                if(grid[i][j] == '1' && !visited[i][j])
10                {
11                    bfs(i,j,grid,visited,m,n);
12                    island++;
13                }
14                else
15                      continue;
16               
17            }
18        }
19        return island;
20    }
21    private void bfs(int r, int c, char[][] grid, boolean[][] visited, int m, int n) {
22        Queue<int[]> queue = new ArrayDeque<>();
23        queue.offer(new int[]{r, c});
24        visited[r][c] = true; // Mark as visited as soon as it enters the queue
25        
26        while (!queue.isEmpty()) {
27            int[] curr = queue.poll();
28            int currRow = curr[0];
29            int currCol = curr[1];
30            
31            // Check all 4 neighboring directions
32            for (int[] d : dir) {
33                int newRow = currRow + d[0];
34                int newCol = currCol + d[1];
35                
36                // Ensure boundaries, check if it's land, and make sure it's not visited
37                if (newRow >= 0 && newRow < m && newCol >= 0 && newCol < n 
38                    && grid[newRow][newCol] == '1' && !visited[newRow][newCol]) {
39                    
40                    visited[newRow][newCol] = true; // Mark immediately to avoid duplicate queue entries
41                    queue.offer(new int[]{newRow, newCol});
42                    }
43            } 
44        }
45    }
46}