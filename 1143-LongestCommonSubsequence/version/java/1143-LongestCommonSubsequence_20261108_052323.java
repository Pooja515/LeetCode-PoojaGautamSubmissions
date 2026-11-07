// Last updated: 08/11/2026, 05:23:23
1class Solution {
2    public int longestCommonSubsequence(String text1, String text2) {
3        int m = text1.length(), n = text2.length();
4        int[] dp = new int[n + 1];
5        for (int i = 0; i <= m; i++) {
6              int[] cur = new int[n + 1];
7            for (int j = 0; j <= n; j++) {
8                if (i == 0 || j == 0) {
9                    cur[j] = 0;
10                } else if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
11                    cur[j] = 1 + dp[j - 1];
12                } else {
13                    cur[j] = Math.max(dp[j], cur[j - 1]);
14
15                }
16
17            }
18              dp=cur;
19        }
20        return dp[n];
21
22    }
23}