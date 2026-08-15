// Last updated: 15/08/2026, 07:15:06
1class Solution {
2
3    public int longestPalindromeSubseq(String s) {
4        int n= s.length();
5        String s2 = new StringBuilder(s).reverse().toString();
6
7        int[][] dp= new int[n+1][n+1];
8
9        for(int ind1 = 0; ind1 <= n;ind1++){
10            for(int ind2=0; ind2 <= n;ind2++){
11                if(ind1 == 0 || ind2==0){
12                    dp[ind1][ind2] =0;
13                }
14                else{
15                  if(s.charAt(ind1-1) == s2.charAt(ind2-1)){
16                        dp[ind1][ind2] = 1 + dp[ind1-1][ind2-1];
17                    }
18                 else{
19                       dp[ind1][ind2] = Math.max(dp[ind1-1][ind2] , dp[ind1][ind2-1]);
20                    } 
21                }
22            }
23        }
24        
25      return dp[n][n];
26    }
27}