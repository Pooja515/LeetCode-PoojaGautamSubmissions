// Last updated: 09/11/2026, 19:38:41
1class Solution {
2    int[][] memo;
3    public int uniquePaths(int m, int n) {
4        if(m == 0|| n == 0) return 0;
5        memo = new int[m][n];
6        for(int[] rows:memo){
7            Arrays.fill(rows,-1);
8        }
9
10        return f(m-1,n-1);
11
12    }
13    int f(int i,int j){
14
15        if(i==0 && j==0) return 1;
16        if(i<0 || j<0) return 0;
17
18        if(memo[i][j] != -1) return memo[i][j];
19
20        int up = f(i-1,j);
21        int left = f(i,j-1);
22
23        return memo[i][j] = up + left;
24    }
25}