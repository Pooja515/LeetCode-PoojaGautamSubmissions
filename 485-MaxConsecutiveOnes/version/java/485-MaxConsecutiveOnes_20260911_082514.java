// Last updated: 11/09/2026, 08:25:14
1class Solution {
2    public int findMaxConsecutiveOnes(int[] nums) {
3        int cnt = 0, maxi = 0,n = nums.length;
4        for (int i = 0; i < n; i++) {
5            if (nums[i] != 0)
6                cnt++;
7            else
8                cnt = 0;
9            maxi = Math.max(maxi, cnt);
10        }
11        return maxi;
12    }
13}