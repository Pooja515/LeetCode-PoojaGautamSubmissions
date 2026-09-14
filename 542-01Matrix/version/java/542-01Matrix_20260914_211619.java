// Last updated: 14/09/2026, 21:16:19
1class Solution {
2    public int[][] updateMatrix(int[][] mat) {
3        int m = mat.length , n = mat[0].length;
4
5        Queue<int[]> q = new LinkedList<>();
6
7        for(int r=0;r<m;r++){
8            for(int c=0;c<n;c++){
9                if(mat[r][c] == 0){
10                    q.offer(new int[]{r,c});
11                }
12                else{
13                    mat[r][c] = -1;
14                }
15            }
16        }
17        int[][] dir = {{-1,0},{1,0},{0,-1},{0,1}};
18        while(!q.isEmpty()){
19            int[] curr = q.poll();
20            int r = curr[0] , c= curr[1];
21            for(int[] d: dir){
22                int newr = r+d[0] , newc = c+d[1];
23                if(newr >= 0 && newr < m && newc >= 0 && newc < n &&  mat[newr][newc] == -1){
24                    mat[newr][newc] = mat[r][c] + 1;
25                    q.offer(new int[]{newr,newc});
26                }
27            }
28        }
29        return mat;
30    }
31}