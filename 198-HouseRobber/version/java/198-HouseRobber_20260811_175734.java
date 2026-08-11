// Last updated: 11/08/2026, 17:57:34
1class Solution {
2
3    public int rob(int[] nums) {
4        int n = nums.length;
5        int[] dp = new int[n];
6        if(n==1) return nums[0];
7
8        int prev2 = nums[0];
9        int  prev1 = Math.max(nums[0], nums[1]);
10
11        for (int i = 2; i < n; i++) {
12            // notake 
13            int nottake = 0 + prev1;
14            int take = nums[i] + prev2;
15            int curr = Math.max(take, nottake);
16            prev2 = prev1;
17            prev1 = curr;
18        }
19      return prev1;
20    }
21}