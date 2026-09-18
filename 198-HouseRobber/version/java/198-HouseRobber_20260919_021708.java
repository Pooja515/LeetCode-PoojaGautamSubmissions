// Last updated: 19/09/2026, 02:17:08
1class Solution {
2
3    public int rob(int[] nums) {
4        int n = nums.length;
5        int[] dp = new int[n];
6
7        if(n==1) return nums[0];
8
9        dp[0] = nums[0];
10        dp[1] = Math.max(nums[0], nums[1]);
11
12
13        for (int i = 2; i < n; i++) {
14            int take = nums[i] + dp[i - 2];
15            int nottake = 0 + dp[i - 1];
16
17            dp[i] = Math.max(take, nottake);
18        }
19
20        return dp[n-1];
21
22    }
23}