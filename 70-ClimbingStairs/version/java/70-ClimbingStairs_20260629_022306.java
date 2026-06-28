// Last updated: 29/06/2026, 02:23:06
/*
 * Approach : Tabulation -DP
 * 
 * Time Complexity : O(N)
 * Space Complexity : O(N)
*/

1class Solution {
2    public int fib(int n) {
3        if(n <= 1) return n;
4        
5        int[] dp = new int[n+1];
6        dp[0] =0;
7        dp[1] =1;
8
9        for(int i = 2 ;i <= n ; i++){
10            dp[i] = dp[i-1] + dp[i-2];
11        }
12        return dp[n];  
13      }
14}