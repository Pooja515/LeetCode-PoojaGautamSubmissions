// Last updated: 12/07/2026, 21:57:04
1class Solution {
2    public int[][] highestPeak(int[][] isWater) {
3        int m = isWater.length, n = isWater[0].length;
4
5        Queue<int[]> q = new LinkedList<>();
6
7        for (int r = 0; r < m; r++) {
8            for (int c = 0; c < n; c++) {
9                if (isWater[r][c] == 1) {
10                    q.offer(new int[] { r, c });
11                    isWater[r][c] = 0;
12                }
13                else{
14                    isWater[r][c] = -1;
15                }
16            }
17        }
18        int[][] dir = {{-1,0},{1,0},{0,1},{0,-1}};
19        while(!q.isEmpty()){
20            int[] cur = q.poll();
21            for(int[] d : dir){
22                int newr = cur[0] + d[0];
23                int newc = cur[1] + d[1];
24
25                if(newr >= 0 && newr < m && newc >= 0 && newc < n &&  isWater[newr][newc] == -1){
26                    isWater[newr][newc] = isWater[cur[0]][cur[1]] + 1;
27                    q.offer( new int[] { newr , newc});
28                }
29            }
30        }
31        return isWater;
32    }
33}