// Last updated: 03/09/2026, 01:45:27
1class Solution {
2
3    public int longestCommonSubsequence(String text1, String text2) {
4        int m = text1.length(), n = text2.length();
5        if (m == 0 || n == 0)
6            return 0;
7        int[] dp = new int [n + 1];
8
9        for (int ind1 = 0; ind1 <= m; ind1++) {
10            int[] cur = new int [n + 1];
11            for (int ind2 = 0; ind2 <= n; ind2++) {
12                if (ind1 == 0 || ind2 == 0) {
13                     cur[ind2] = 0;
14
15                } else {
16                    if (text1.charAt(ind1-1) == text2.charAt(ind2-1)) {
17                        cur[ind2] = 1 + dp[ind2 - 1];
18                    }
19
20                    else {
21                        cur[ind2] = Math.max(dp[ind2], cur[ind2 - 1]);
22                    }
23                }
24            }
25            dp=cur;
26        }
27      
28       return dp[n];
29    }
30}