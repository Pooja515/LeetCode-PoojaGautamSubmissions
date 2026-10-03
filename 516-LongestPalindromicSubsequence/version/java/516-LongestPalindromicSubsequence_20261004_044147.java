// Last updated: 04/10/2026, 04:41:47
1class Solution {
2
3    public int longestPalindromeSubseq(String s) {
4        int n = s.length();
5        String s2 = new StringBuilder(s).reverse().toString();
6
7        int[][] dp=new int[n+1][n+1];
8         for(int i=0;i<=n;i++){
9            for(int j=0;j<=n;j++){
10                if(i==0 || j==0){
11                    dp[i][j]=0;
12                }
13                else{
14                    if(s.charAt(i-1) == s2.charAt(j-1)){
15                            dp[i][j] = 1+dp[i-1][j-1];
16                        }
17                 else{
18                        dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
19                      }
20                }
21            }
22         }
23    return dp[n][n];
24    }
25}