// Last updated: 20/08/2026, 06:54:49
1class Solution {
2    public int countPairs(List<Integer> nums, int target) {
3        Collections.sort(nums);
4        int l = 0, r = nums.size() - 1, cnt = 0;
5        while (l < r) {
6            if (nums.get(l) + nums.get(r) < target) {
7                cnt += r - l;
8                l++;
9            } else {
10                r--;
11            }
12
13        }
14        return cnt;
15    }
16}