// Last updated: 06/10/2026, 05:56:48
1class Solution {
2
3    public int numDistinct(String s, String t) {
4        int m = s.length(), n = t.length();
5        int[][] dp = new int[m + 1][n + 1];
6
7           for (int i = 0; i <= m; i++) {
8            for (int j = 0; j <= n; j++) {
9                if(j==0) {
10                    dp[i][j] =1;
11                }
12                else if(i==0){
13                    dp[i][j] =0;
14                }
15                else{
16                    if(s.charAt(i-1) == t.charAt(j-1)) {
17                        dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
18                    } else {
19                        dp[i][j] = dp[i - 1][j];
20                    }
21                }
22            }
23        }
24
25        return dp[m][n];
26
27    }
28}