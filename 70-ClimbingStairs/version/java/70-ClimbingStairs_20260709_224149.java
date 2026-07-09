// Last updated: 09/07/2026, 22:41:49
1class Solution {
2    
3    public int climbStairs(int n) {
4        if(n <= 1) return 1;
5        if(n==2) return n;
6        
7         int prev2 = 1 , prev1 = 1;
8
9         for(int i = 2;i<=n ;i++){
10            int cur  = prev2 + prev1;
11            prev2 = prev1;
12            prev1 = cur;
13         }
14
15        return prev1;
16    }
17}