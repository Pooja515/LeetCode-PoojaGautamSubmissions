// Last updated: 03/09/2026, 01:42:08
1class Solution {
2
3    public int longestCommonSubsequence(String text1, String text2) {
4        int m = text1.length(), n = text2.length();
5        if (m == 0 || n == 0)
6            return 0;
7        int[][] dp = new int[m + 1][n + 1];
8
9        for (int ind1 = 0; ind1 <= m; ind1++) {
10            for (int ind2 = 0; ind2 <= n; ind2++) {
11                if (ind1 == 0 || ind2 == 0) {
12                    dp[ind1][ind2] = 0;
13
14                } else {
15                    if (text1.charAt(ind1-1) == text2.charAt(ind2-1)) {
16                        dp[ind1][ind2] = 1 + dp[ind1 - 1][ind2 - 1];
17                    }
18
19                    else {
20                        dp[ind1][ind2] = Math.max(dp[ind1 - 1][ind2], dp[ind1][ind2 - 1]);
21                    }
22                }
23            }
24        }
25      
26       return dp[m][n];
27    }
28}