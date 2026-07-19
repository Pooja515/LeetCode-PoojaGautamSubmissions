// Last updated: 19/07/2026, 06:55:01
1class Solution {
2    public int[] productExceptSelf(int[] nums) {
3        int n = nums.length;
4        int[] ans = new int[n];
5        int prefix = 1, suffix = 1;
6        for (int i = 0; i < n; i++) {
7            ans[i] = prefix;
8            prefix *= nums[i];
9        }
10        for (int i = n - 1; i >= 0; i--) {
11            ans[i] *= suffix;
12            suffix *= nums[i];
13        }
14        return ans;
15    }
16}