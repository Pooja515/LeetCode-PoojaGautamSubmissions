// Last updated: 07/08/2026, 22:31:52
1class Solution {
2
3    public int longestCommonSubsequence(String text1, String text2) {
4        int m = text1.length(), n = text2.length();
5        int[][] dp = new int[m + 1][n + 1];
6
7        for (int ind1 = 0; ind1 <= m; ind1++) {
8            for (int ind2 = 0; ind2 <= n; ind2++) {
9                if (ind1 == 0 || ind2 == 0) {
10                    dp[ind1][ind2] = 0;
11                } else {
12                    // match
13                    if (text1.charAt(ind1 - 1) == text2.charAt(ind2 - 1)) {
14                        dp[ind1][ind2] = 1 + dp[ind1 - 1][ind2 - 1];
15                    } else
16                        //not match
17                        dp[ind1][ind2] = Math.max(dp[ind1 - 1][ind2], dp[ind1][ind2 - 1]);
18                }
19            }
20        }
21      return dp[m][n];
22    }
23}