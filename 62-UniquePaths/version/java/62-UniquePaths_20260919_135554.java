// Last updated: 19/09/2026, 13:55:54
1class Solution {
2
3    public int uniquePaths(int m, int n) {
4
5        if (m == 0 || n == 0)
6            return 0;
7        int[] dp = new int [n];
8        for (int i = 0; i < m; i++) {
9             int[] cur = new int [n];
10            for (int j = 0; j < n; j++) {
11                if (i < 0 || j < 0){
12                    cur[j]= 0;
13                    continue;
14                }
15                   
16                if (i == 0 || j == 0){
17                    cur[j]= 1;
18                    continue;
19                }
20                   
21                int up =0 ,left=0;
22                if(i>0) up= dp[j];
23                if(j>0) left = cur[j - 1];
24
25                cur[j] = up + left;
26            }
27            dp=cur;
28        }
29        return dp[n-1];
30
31    }
32}