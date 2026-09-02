// Last updated: 03/09/2026, 03:51:42
1class Solution {
2
3    public int numDistinct(String s, String t) {
4        int m = s.length(), n = t.length();
5        if (n == 0)
6            return 0;
7        if (m < n)
8            return 0;
9
10        int[][] dp = new int[m + 1][n + 1];
11
12        for(int i=0;i<=m;i++){
13            dp[i][0] =1;
14        }
15
16        for (int i = 1; i <= m; i++) {
17            for (int j = 1; j <= n; j++) {
18                if (j == 0)
19                    dp[0][0] = 1;
20                if (i == 0)
21                    dp[i][j] = 0;
22                // take
23                else if (s.charAt(i-1) == t.charAt(j-1)) {
24                    dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
25                } else {
26                    dp[i][j] = dp[i - 1][j];
27                }
28
29            }
30        }
31        return dp[m][n];
32    }
33}