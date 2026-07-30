// Last updated: 30/07/2026, 11:18:42
1class Solution {
2    public int minimumEffortPath(int[][] heights) {
3        int n = heights.length;
4        int m = heights[0].length;
5
6        //PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) ->Integer.compare(a[0],b[0]));
7        PriorityQueue<int[]> pq =new PriorityQueue<>((a, b) ->Integer.compare(a[0],b[0]));
8        int[][] distance = new int[n][m];
9        for(int[] row : distance){
10                Arrays.fill(row,(int) 1e9);
11        }
12
13       distance[0][0] = 0; // source (0,0) =0;
14
15       pq.offer(new int[] {0,0,0}); // pair {distance , r,c};
16
17       int[][] dir = {{-1,0} ,{1,0} ,{0,-1} ,{0,1}}; // 4 directions
18
19       while(!pq.isEmpty()){
20        int[] curr = pq.poll();
21        int currdistance = curr[0];
22        int r = curr[1];
23        int c = curr[2];
24
25        if(r == n-1 && c == m-1){
26            return currdistance;
27        }
28
29        for(int[] d :dir){
30            int newr = r+d[0] , newc = c+d[1];
31            if(newr >= 0 && newr < n && newc >= 0 && newc < m ){
32                int newdistance = Math.max(Math.abs(heights[r][c] - heights[newr][newc]),currdistance );
33
34                if(newdistance < distance[newr][newc]){
35                    distance[newr][newc] = newdistance;
36                    pq.offer(new int[]{newdistance , newr , newc});
37                }
38            }
39        }
40
41       }
42       return 0;
43    }
44}