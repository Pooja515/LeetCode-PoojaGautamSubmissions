// Last updated: 07/08/2026, 22:35:45
1class Solution {
2
3    public int longestCommonSubsequence(String text1, String text2) {
4        int m = text1.length(), n = text2.length();
5        int[] dp = new int [n + 1];
6
7        for (int ind1 = 0; ind1 <= m; ind1++) {
8             int[] cur = new int [n + 1];
9            for (int ind2 = 0; ind2 <= n; ind2++) {
10                if (ind1 == 0 || ind2 == 0) {
11                    cur[ind2] = 0;
12                } else {
13                    // match
14                    if (text1.charAt(ind1 - 1) == text2.charAt(ind2 - 1)) {
15                        cur[ind2] = 1 + dp[ind2 - 1];
16                    } else
17                        //not match
18                        cur[ind2] = Math.max(dp[ind2], cur[ind2 - 1]);
19                }
20            }
21            dp=cur;
22        }
23        return dp[n];
24    }
25}