// Last updated: 13/08/2026, 22:14:56
1class Solution {
2
3    public int longestCommonSubsequence(String text1, String text2) {
4        int m = text1.length(), n = text2.length();
5
6        int[][] dp = new int[m + 1][n + 1];
7
8        for (int ind1 = 0; ind1 <= m ; ind1++) {
9            for (int ind2 = 0; ind2 <=n; ind2++) {
10                if (ind1 == 0 || ind2 == 0)
11                    dp[ind1][ind2] = 0;
12
13                else {
14                    if (text1.charAt(ind1-1) == text2.charAt(ind2-1))
15                          dp[ind1][ind2] = 1 + dp[ind1 - 1][ind2 - 1];
16                    else 
17                         dp[ind1][ind2] = Math.max(dp[ind1 - 1][ind2], dp[ind1][ind2 - 1]);
18                }
19            }
20        }
21        return dp[m][n];
22    }
23
24}