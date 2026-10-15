// Last updated: 15/10/2026, 08:52:17
1class Solution {
2    public int rob(int[] nums) {
3        int n = nums.length;
4        if (n == 1)
5            return nums[0];
6        if (n == 2)
7            return Math.max(nums[0], nums[1]);
8      
9        int prev2 = nums[0];
10        int prev1 = Math.max(nums[0], nums[1]);
11
12        for (int ind = 2; ind < n; ind++) {
13            int take = nums[ind] + prev2;
14            int nottake = 0 + prev1;
15
16            int cur = Math.max(take, nottake);
17
18            prev2 = prev1;
19            prev1 = cur;
20        }
21
22        return prev1;
23    }
24}