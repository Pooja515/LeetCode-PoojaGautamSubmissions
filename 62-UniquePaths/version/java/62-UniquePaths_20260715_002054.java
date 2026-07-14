// Last updated: 15/07/2026, 00:20:54
1class Solution {
2    int[][] memo;
3    public int uniquePaths(int m, int n) {
4        if (m == 0)
5            return 0;
6        memo = new int[m][n];
7
8        for(int[] r:memo) Arrays.fill(r,-1);
9
10        return f(m - 1, n - 1);
11
12    }
13
14    int f(int i, int j) {
15        if (i == 0 && j == 0)
16            return 1;
17        if (i < 0 || j < 0)
18            return 0;
19
20        if(memo[i][j] != -1){
21            return memo[i][j];
22        }
23
24        int left = f(i, j - 1);
25        int up = f(i - 1, j);
26
27        return memo[i][j] = left + up;
28
29    }
30}