// Last updated: 16/07/2026, 16:15:21
1class Solution {
2    public boolean containsDuplicate(int[] nums) {
3        HashSet<Integer> set = new HashSet<>();
4        for (int i = 0; i < nums.length; i++) {
5            if (set.contains(nums[i]))
6                return true;
7            set.add(nums[i]);
8        }
9        return false;
10    }
11}