// Last updated: 04/08/2026, 22:06:22
1class Solution {
2    public int longestPalindromeSubseq(String s) {
3        int m = s.length();
4        String s2 = new StringBuilder(s).reverse().toString();
5        int[][] dp = new int[m+1][m+1];
6
7        for(int ind1 =0;ind1 <=m;ind1++){
8            for(int ind2 =0;ind2 <=m;ind2++){
9                  if(ind1 == 0 || ind2 == 0) {
10                    dp[ind1][ind2] = 0;
11                  }
12                  else{
13                    if(s.charAt(ind1-1) == s2.charAt(ind2-1)){
14                        dp[ind1][ind2] = 1 + dp[ind1-1][ind2-1];
15                    }
16                    else{
17                         dp[ind1][ind2] =  Math.max(dp[ind1-1][ind2],dp[ind1][ind2-1]);
18                    }
19                  }
20            }
21        }
22      return dp[m][m];
23    }
24}