// Last updated: 06/09/2026, 16:26:27
1class Solution {
2
3    public int numDistinct(String s, String t) {
4        int m = s.length(), n = t.length();
5        if (m < n)
6            return 0;
7        int[][] dp = new int[m + 1][n + 1];
8
9        for (int i = 0; i <= m; i++) {
10            for (int j = 0; j <= n; j++) {
11                if(j==0) {
12                    dp[i][j] =1;
13                    continue;
14                }
15                if(i==0){
16                    dp[i][j] =0;
17                    continue;
18                }
19                int take = 0, nottake = 0;
20                if (s.charAt(i-1) == t.charAt(j-1)) {
21                    take = dp[i - 1][j - 1] + dp[i - 1][j];
22                } else {
23                    nottake = dp[i - 1][j];
24                }
25
26                dp[i][j] = take + nottake;
27            }
28
29        }
30
31        return dp[m][n];
32
33    }
34}