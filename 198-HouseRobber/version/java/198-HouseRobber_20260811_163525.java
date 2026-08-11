// Last updated: 11/08/2026, 16:35:25
1class Solution {
2
3    public int rob(int[] nums) {
4        int n = nums.length;
5        int[] dp = new int[n];
6        if(n==1) return nums[0];
7
8        dp[0] = nums[0];
9        dp[1] = Math.max(nums[0], nums[1]);
10
11        for (int i = 2; i < n; i++) {
12            // notake 
13            int nottake = 0 + dp[i - 1];
14            int take = nums[i] + dp[i - 2];
15            dp[i] = Math.max(take, nottake);
16        }
17      return dp[n-1];
18    }
19}