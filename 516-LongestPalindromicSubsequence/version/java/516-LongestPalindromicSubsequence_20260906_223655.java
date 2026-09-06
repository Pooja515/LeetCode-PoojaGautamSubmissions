// Last updated: 06/09/2026, 22:36:55
1class Solution {
2
3    public int longestPalindromeSubseq(String s) {
4        int n = s.length();
5        String t = new StringBuilder(s).reverse().toString();
6
7        int[][] dp = new int[n + 1][n + 1];
8
9        for (int i = 0; i <= n; i++) {
10            for (int j = 0; j <= n; j++) {
11                if (i == 0 || j == 0) {
12                    dp[i][j] = 0;
13                    continue;
14                } else {
15                    //match 
16
17                    if (s.charAt(i - 1) == t.charAt(j - 1)) {
18                        dp[i][j] = 1 + dp[i - 1][j - 1];
19                    }
20                    //notmatch
21                    else {
22                        dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
23                    }
24                }
25            }
26        }
27
28        return dp[n][n];
29    }
30}