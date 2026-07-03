// Last updated: 04/07/2026, 02:27:45
1class Solution {
2    public int minInsertions(String s) {
3        int n = s.length();
4        return n - longestPalindromeSubseq(s); 
5    }
6    public int longestPalindromeSubseq(String s) {
7        int n = s.length();
8        int[][] dp = new int[n+1][n+1];
9
10        for(int i = 0;i<=n;i++){
11            for(int j=0;j<=n;j++){
12
13                 if(i == 0 || j == 0){
14                    dp[i][j] =0;
15                 }
16
17                 else{
18                      if (s.charAt(i - 1) == s.charAt(n - j)) {
19                              dp[i][j] = 1 + dp[i-1][j-1];
20                        }
21                        else{
22                             dp[i][j] = 0 + Math.max(dp[i-1][j] , dp[i][j-1] );
23                          } 
24                    }
25                    
26                }
27            }
28      return dp[n][n];
29    }
30}