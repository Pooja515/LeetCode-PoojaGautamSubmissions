// Last updated: 19/09/2026, 02:20:28
1class Solution {
2
3    public int rob(int[] nums) {
4        int n = nums.length;
5        if(n==1) return nums[0];
6
7        int prev2 = nums[0];
8        int prev1 = Math.max(nums[0], nums[1]);
9
10        for (int i = 2; i < n; i++) {
11            int take = nums[i] + prev2;
12            int nottake = 0 + prev1;
13
14            int cur = Math.max(take, nottake);
15            prev2 = prev1;
16            prev1 = cur;
17        }
18
19        return prev1;
20
21    }
22}