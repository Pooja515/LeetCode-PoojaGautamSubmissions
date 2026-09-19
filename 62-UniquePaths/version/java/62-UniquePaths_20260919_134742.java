// Last updated: 19/09/2026, 13:47:42
1class Solution {
2    int[][] memo;
3    public int uniquePaths(int m, int n) {
4        
5        if(m== 0 || n==0) return 0;
6        memo = new int[m][n];
7        for(int[] rows:memo){
8            Arrays.fill(rows,-1);
9        }
10        return f(m-1,n-1);
11    }
12    int f(int i , int j){
13        if(i<0 || j<0) return 0;
14        if(i==0 || j==0) return 1;
15
16        if(memo[i][j] != -1) return memo[i][j];
17
18        int up = f(i-1,j);
19        int left = f(i,j-1);
20
21        return memo[i][j] = up+left;
22    }
23}