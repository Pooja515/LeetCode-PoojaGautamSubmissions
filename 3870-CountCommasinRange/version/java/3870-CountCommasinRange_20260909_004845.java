// Last updated: 09/09/2026, 00:48:45
1class Solution {
2    public int countCommas(int n) {
3       int res = 0;
4        for (int i = 1; i <= n; i++) {
5            if (i > 999) {
6                res += 1;
7            }
8        }
9        return res; 
10    }
11}
12
13
14
15   
16        
17 