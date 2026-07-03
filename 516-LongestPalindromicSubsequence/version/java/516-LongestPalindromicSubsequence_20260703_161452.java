// Last updated: 03/07/2026, 16:14:52
// optimized by removing reverse logic
1class Solution {
2  
3    public int longestPalindromeSubseq(String s) {
4        int n = s.length();
5        int[][] dp = new int[n+1][n+1];
6
7        for(int i = 0;i<=n;i++){
8            for(int j=0;j<=n;j++){
9
10                 if(i == 0 || j == 0){
11                    dp[i][j] =0;
12                 }
13
14                 else{
15                      if (s.charAt(i - 1) == s.charAt(n - j)) {
16                              dp[i][j] = 1 + dp[i-1][j-1];
17                        }
18                        else{
19                             dp[i][j] = 0 + Math.max(dp[i-1][j] , dp[i][j-1] );
20                          } 
21                    }
22                    
23                }
24            }
25      return dp[n][n];
26    }
27}