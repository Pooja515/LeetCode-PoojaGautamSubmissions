// Last updated: 13/08/2026, 22:23:00
1class Solution {
2
3    public int longestCommonSubsequence(String text1, String text2) {
4        int m = text1.length(), n = text2.length();
5
6        int[] dp = new int [n + 1];
7
8        for (int ind1 = 0; ind1 <= m ; ind1++) {
9                int[] cur = new int [n + 1];
10            for (int ind2 = 0; ind2 <=n; ind2++) {
11                if (ind1 == 0 || ind2 == 0)
12                    cur[ind2] = 0;
13
14                else {
15                    if (text1.charAt(ind1-1) == text2.charAt(ind2-1))
16                          cur[ind2] = 1 + dp[ind2 - 1];
17                    else 
18                          cur[ind2] = Math.max(dp[ind2], cur[ind2 - 1]);
19                }
20
21            }
22            dp=cur;
23        }
24        return dp[n];
25    }
26
27}