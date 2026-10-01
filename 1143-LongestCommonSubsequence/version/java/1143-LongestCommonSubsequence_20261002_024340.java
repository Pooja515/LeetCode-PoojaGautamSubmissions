// Last updated: 02/10/2026, 02:43:40
1class Solution {
2
3    public int longestCommonSubsequence(String text1, String text2) {
4        int m = text1.length(), n = text2.length();
5        int[] dp = new int[n + 1];
6
7        for (int i = 0; i <= m; i++) {
8            int[] cur = new int[n + 1];
9            for (int j = 0; j <= n; j++) {
10                if (i == 0 || j == 0) {
11                    cur[j] = 0;
12                } else {
13                    if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
14                        cur[j] = 1 + dp[j - 1];
15                    } else {
16                        cur[j] = Math.max(dp[j], cur[j - 1]);
17                    }
18
19                }
20
21            }
22            dp = cur;
23        }
24
25        return dp[n];
26    }
27}