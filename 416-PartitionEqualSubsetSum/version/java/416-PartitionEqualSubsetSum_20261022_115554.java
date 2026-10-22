// Last updated: 22/10/2026, 11:55:54
1class Solution {
2    public boolean canPartition(int[] nums) {
3        int n = nums.length;
4        int sum = 0;
5        for (int i = 0; i < n; i++) {
6            sum += nums[i];
7        }
8
9        if (sum % 2 != 0)
10            return false;
11        int target = sum / 2;
12
13        boolean[][] dp = new boolean[n][target + 1];
14
15        for (int i = 0; i < n; i++) {
16            dp[i][0] = true;
17        }
18
19        if (nums[0] <= target) {
20            dp[0][nums[0]] = true;
21        }
22
23        for (int i = 1; i < n; i++) {
24            for (int t = 0; t <= target; t++) {
25                boolean nottake = dp[i - 1][t];
26                boolean take = false;
27                if (nums[i] <= t) {
28                    take = dp[i - 1][t - nums[i]];
29                }
30
31                dp[i][t] = take || nottake;
32            }
33        }
34        return dp[n - 1][target];
35
36    }
37}