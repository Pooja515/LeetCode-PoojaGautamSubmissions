// Last updated: 01/11/2026, 18:03:20
1class Solution {
2    public int climbStairs(int n) {
3       if(n==0) return 0;
4
5       int[] dp = new int[n+1];
6       dp[0] =1;
7       dp[1] =1;
8       for(int i=2;i<=n;i++){
9           dp[i] = dp[i-1] + dp[i-2];
10       }
11       return dp[n];
12    }
13}