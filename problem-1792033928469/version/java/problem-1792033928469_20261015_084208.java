// Last updated: 15/10/2026, 08:42:08
1class Solution {
2    public int rob(int[] nums) {
3        int n = nums.length;
4        int[] memo = new int[n];
5        Arrays.fill(memo,-1);
6
7        return f(n - 1, nums,memo);
8    }
9
10    int f(int ind, int[] nums , int[] memo) {
11        if (ind == 0)
12            return nums[ind];
13        if (ind == 1)
14            return Math.max(nums[0], nums[1]);
15
16        if(memo[ind] != -1) return memo[ind];
17
18        int take = nums[ind] + f(ind - 2, nums,memo);
19        int nottake = 0 + f(ind - 1, nums, memo);
20
21        return memo[ind]= Math.max(take, nottake);
22    }
23}