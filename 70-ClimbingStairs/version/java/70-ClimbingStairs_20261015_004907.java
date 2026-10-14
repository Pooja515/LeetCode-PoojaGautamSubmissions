// Last updated: 15/10/2026, 00:49:07
1class Solution {
2    public int climbStairs(int n) {
3       int[] dp = new int[n+1];
4       dp[0] =1;
5       dp[1] =1;
6
7       for(int i=2;i<=n;i++){
8           dp[i] = dp[i-1] + dp[i-2];
9       } 
10       return dp[n];
11    }
12}