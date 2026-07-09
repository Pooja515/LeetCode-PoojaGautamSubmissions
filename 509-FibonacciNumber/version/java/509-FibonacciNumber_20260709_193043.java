// Last updated: 09/07/2026, 19:30:43
1class Solution {
2   
3    public int fib(int n) {
4        if(n<=1) return n;
5        int[] dp = new int[n+1];
6        dp[0] = 0;
7        dp[1] =1;
8
9        for(int i= 2;i <= n;i++){
10            dp[i] = dp[i-1] + dp[i-2];
11        }
12
13        return dp[n] ;
14    }
15}