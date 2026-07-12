// Last updated: 12/07/2026, 19:11:23
1class Solution {
2    public int[][] updateMatrix(int[][] mat) {
3
4        if(mat == null || mat.length == 0) return mat;
5
6        int m = mat.length , n = mat[0].length;
7
8        Queue<int[]> q = new LinkedList<>();
9        
10        for(int r = 0 ; r<m ; r++){
11            for(int c = 0 ; c<n ; c++){
12                if(mat[r][c] == 0) {
13                    q.offer(new int[] {r,c});
14                }
15                else{
16                    mat[r][c] = -1;
17                }
18            }
19        }
20
21        int[][] dir ={{-1,0} ,{1,0},{0,-1} ,{0,1}};
22
23        while(!q.isEmpty()){
24            int[] cur = q.poll();
25            for(int[] d : dir){
26                int newr = cur[0] + d[0];
27                int newc = cur[1] + d[1];
28                if(newr >= 0 && newr < m && newc >= 0 && newc < n && mat[newr][newc] == -1){
29                    mat[newr][newc] = mat[cur[0]][cur[1]] + 1;
30                    q.offer(new int[] {newr,newc});
31                }
32            }
33
34        }
35        return mat;
36    }
37}