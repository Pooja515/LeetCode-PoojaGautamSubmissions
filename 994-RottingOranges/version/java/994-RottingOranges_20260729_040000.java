// Last updated: 29/07/2026, 04:00:00
1class Solution {
2    public int orangesRotting(int[][] grid) {
3
4        if(grid == null || grid.length == 0) return 0;
5
6        int m = grid.length , n = grid[0].length;
7
8        Queue<int[]> q = new LinkedList<>();
9
10        int fresh =0;
11
12        for(int r = 0 ;r<m;r++){
13            for(int c=0;c<n;c++){
14                 if(grid[r][c] == 2){
15                     q.offer(new int[] {r,c});
16                 }
17                 else{
18                    if(grid[r][c] == 1) fresh++;
19                 }
20            }
21        }
22
23        if(fresh == 0) return 0;
24
25        int minutes =0;
26        int[][] dir = {{-1,0} ,{1,0}, {0,-1}, {0,1}};
27        while(!q.isEmpty() && fresh > 0){
28            int size = q.size();
29            minutes++;
30            for(int i =0 ;i<size;i++){
31                   int[] curr = q.poll();
32                   for(int[] d : dir){
33                        int newr = curr[0] +d[0] , newc = curr[1] + d[1];
34                        if(newr >= 0 && newr < m && newc >= 0 && newc < n  && grid[newr][newc] == 1){
35                            grid[newr][newc] =2;
36                            q.offer(new int[] {newr,newc});
37                            fresh--;
38                        }
39
40                    }
41                
42                }
43        
44             }
45    return fresh == 0 ?minutes:-1;
46    }
47}