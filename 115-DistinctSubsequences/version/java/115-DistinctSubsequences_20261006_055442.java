// Last updated: 06/10/2026, 05:54:42
1class Solution {
2
3    public int numDistinct(String s, String t) {
4        int m = s.length(), n = t.length();
5        int[][] dp = new int[m + 1][n + 1];
6
7        for(int i=0;i<=m;i++){
8            dp[i][0]=1;
9        }
10
11        for (int i = 1; i <= m; i++) {
12            for (int j = 1; j <=n; j++) {
13                    if(s.charAt(i-1) == t.charAt(j-1)) {
14                        dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
15                    } else {
16                        dp[i][j] = dp[i - 1][j];
17                    }
18            }
19        }
20
21        return dp[m][n];
22
23    }
24}