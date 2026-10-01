// Last updated: 02/10/2026, 02:32:35
1class Solution {
2  
3    public int longestCommonSubsequence(String text1, String text2) {
4        int m=text1.length() , n=text2.length();
5        int[][] dp = new int[m+1][n+1];
6
7        for(int i=0;i<=m;i++){
8            for(int j=0;j<=n;j++){
9                if(i==0 || j==0){
10                    dp[i][j] =0;
11                }
12                else{
13                     if(text1.charAt(i-1) == text2.charAt(j-1)){
14                            dp[i][j] =1 + dp[i-1][j-1];
15                       }
16                       else{
17                          dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
18                       }
19       
20                }
21            }
22        }
23    
24      return dp[m][n];
25    }
26}