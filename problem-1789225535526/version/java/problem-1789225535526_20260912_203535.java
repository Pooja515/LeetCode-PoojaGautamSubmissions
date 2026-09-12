// Last updated: 12/09/2026, 20:35:35
1class Solution {
2    public int minDays(int n) {
3
4        int target = n;
5
6        int[] dp = new int[target + 1];
7
8        Arrays.fill(dp, Integer.MAX_VALUE / 2);
9
10        dp[0] = 0;
11
12        for (int t = 1; t <= target; t++) {
13            for (int k = 1; k * (k + 1) / 2 <= t; k++) {
14                int streakScore = k * (k + 1) / 2;
15                int previousScore = t - streakScore;
16
17                if (previousScore == 0) {
18                    dp[t] = Math.min(dp[t], k);
19                } else {
20                    dp[t] = Math.min(dp[t], dp[previousScore] + k + 1);
21                }
22            }
23        }
24
25        return dp[target];
26    }
27}