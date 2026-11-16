// Last updated: 16/11/2026, 11:34:29
1class Solution {
2
3    public int lengthOfLIS(int[] nums) {
4        if (nums == null)
5            return 0;
6        int n = nums.length;
7
8        int[][] dp = new int[n + 1][n + 1];
9        for (int ind = n - 1; ind >= 0; ind--) {
10
11            for (int prev_ind = ind - 1; prev_ind >= -1; prev_ind--) {
12
13                int nottake = dp[ind + 1][prev_ind + 1];
14
15                int take = 0;
16
17                if (prev_ind == -1 || nums[ind] > nums[prev_ind]) {
18                    take = 1 + dp[ind + 1][ind + 1];
19                }
20
21                dp[ind][prev_ind + 1] = Math.max(take, nottake);
22            }
23        }
24       return dp[0][0];
25    }
26}