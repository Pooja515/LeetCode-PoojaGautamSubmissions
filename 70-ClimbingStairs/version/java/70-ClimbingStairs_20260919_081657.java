// Last updated: 19/09/2026, 08:16:57
1class Solution {
2
3    public int climbStairs(int n) {
4        if (n == 1 || n == 2)
5            return n;
6     
7        int p2 = 1 , p1 = 1;
8
9        for (int i = 2; i <= n; i++) {
10      
11            int cur = p2+p1;
12            p2 = p1;
13            p1 = cur;
14        }
15        return p1;
16    }
17}