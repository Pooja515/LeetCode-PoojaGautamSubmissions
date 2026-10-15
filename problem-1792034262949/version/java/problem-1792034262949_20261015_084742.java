// Last updated: 15/10/2026, 08:47:42
1class Solution {
2    public int rob(int[] nums) {
3        int n = nums.length;
4        if(n==1) return nums[0];
5        if(n==2) return Math.max(nums[0],nums[1]);
6        int[] dp = new int[n];
7        dp[0] = nums[0];
8        dp[1] = Math.max(nums[0], nums[1]);
9          
10        for(int ind =2;ind<n;ind++){
11           int take = nums[ind] + dp[ind - 2];
12           int nottake = 0 + dp[ind - 1];
13
14           dp[ind] = Math.max(take, nottake);
15        }
16
17        return dp[n-1];
18    }
19}