// Last updated: 11/09/2026, 02:46:53
1class Solution {
2    public boolean check(int[] nums) {
3        int n = nums.length, cnt = 0;
4        for (int i = 0; i < n; i++) {
5            if (nums[i] > nums[(i + 1)% n]) {
6                cnt++;
7            }
8        }
9        if (cnt > 1)
10            return false;
11        else
12            return true;
13    }
14}