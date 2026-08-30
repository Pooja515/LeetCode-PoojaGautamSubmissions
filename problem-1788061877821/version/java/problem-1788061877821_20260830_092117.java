// Last updated: 30/08/2026, 09:21:17
1class Solution {
2    public int countSpecialIntegers(int[] nums) {
3        HashSet<Integer> set1 = new HashSet<>();
4        HashSet<Integer> set2 = new HashSet<>();
5
6        for (int i = 0; i < nums.length; i++) {
7            if (i == 0 || nums[i] != nums[i - 1]) {
8                if (set1.contains(nums[i])) {
9                    set2.add(nums[i]);
10                }
11                set1.add(nums[i]);
12            }
13        }
14        return set1.size() - set2.size();
15    }
16}