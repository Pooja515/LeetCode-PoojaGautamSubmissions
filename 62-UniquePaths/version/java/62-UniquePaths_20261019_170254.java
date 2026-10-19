// Last updated: 19/10/2026, 17:02:54
1class Solution {
2    public int uniquePaths(int m, int n) {
3
4        int[][] memo = new int[m][n];
5        for(int[] rows:memo){
6            Arrays.fill(rows,-1);
7        }
8        
9        return f(m-1,n-1,memo);
10    }
11
12    int f(int i,int j,int[][] memo){
13        if(i==0 && j==0) return 1;
14        if(i<0 || j<0) return 0;
15
16        if(memo[i][j] != -1) return memo[i][j];
17
18        int left = f(i,j-1,memo);
19        int right = f(i-1,j,memo);
20
21        return memo[i][j] =  left + right;
22    }
23}