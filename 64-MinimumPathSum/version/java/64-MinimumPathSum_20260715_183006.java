// Last updated: 15/07/2026, 18:30:06
1class Solution {
2
3    public int minPathSum(int[][] grid) {
4        int m = grid.length, n = grid[0].length;
5
6        int[] cur = new int[n];
7
8        for(int i=0 ;i<m ;i++){
9            for(int j =0;j<n ;j++){
10                 if (i == 0 && j == 0){
11                     cur[j] = grid[i][j];
12                     continue;
13                 }
14
15            int up = (int) 1e9;
16            int left = (int) 1e9;
17    
18            if (i > 0) up = cur[j];
19            if (j > 0) left = cur[j - 1];
20
21            cur[j] = grid[i][j] + Math.min(up, left);
22         }
23             
24     }
25    return cur[n-1];
26    }
27}