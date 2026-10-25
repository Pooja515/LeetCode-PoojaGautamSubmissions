// Last updated: 26/10/2026, 00:49:39
1class Solution {
2
3    public int longestCommonSubsequence(String text1, String text2) {
4        int m = text1.length(), n = text2.length();
5        int[][] dp = new int[m + 1][n + 1];
6        for (int i = 0; i <= m; i++) {
7            for (int j = 0; j <= n; j++) {
8                if (i == 0 || j == 0) {
9                    dp[i][j] = 0;
10                    continue;
11                }
12                if (text1.charAt(i-1) == text2.charAt(j-1)) {
13                    dp[i][j] = 1 + dp[i - 1][j - 1];
14                } else {
15                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
16                }
17            }
18        }
19
20        return dp[m][n];
21    }
22}