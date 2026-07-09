// Last updated: 09/07/2026, 22:38:13
1class Solution {
2    
3    public int climbStairs(int n) {
4        if(n <= 1) return 1;
5        if(n==2) return n;
6        int[] dp = new int[n+1] ;
7    
8         dp[0] = 1;
9         dp[1] = 1;
10
11         for(int i = 2;i<=n ;i++){
12            dp[i] = dp[i-1] + dp[i-2];
13         }
14
15        return dp[n];
16    }
17}