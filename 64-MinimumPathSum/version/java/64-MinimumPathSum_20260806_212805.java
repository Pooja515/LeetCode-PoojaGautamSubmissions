// Last updated: 06/08/2026, 21:28:05
1class Solution {
2    int[][] memo;
3    public int minPathSum(int[][] grid) {
4        int m = grid.length , n = grid[0].length;
5        if(m==0 || n==0) return 0;
6        memo = new int[m][n];
7        for(int[] rows : memo){
8            Arrays.fill(rows,-1);
9        }
10
11        return f(m-1,n-1,grid) == (int) 1e9 ? -1:f(m-1,n-1,grid);
12    }
13    int f(int i, int j , int[][] grid){
14        //base case
15        if(i==0 && j==0) return grid[0][0];
16        if(i<0 || j<0) return (int) 1e9;
17        int left= (int) 1e9;
18        int up = (int) 1e9;
19
20        if(memo[i][j] != -1) return memo[i][j];
21        if(i>0) {
22            up = f(i-1,j,grid);
23        }
24        if(j>0){
25            left = f(i,j-1,grid);
26        }
27
28       memo[i][j] = grid[i][j] + Math.min(up , left);
29       return memo[i][j];
30    }
31}