// Last updated: 14/11/2026, 11:56:47
1class Solution {
2    public int minSubArrayLen(int target, int[] nums) {
3        int minlen = Integer.MAX_VALUE;
4        int l = 0, sum = 0;
5
6        for (int r = 0; r < nums.length; r++) {
7            sum += nums[r];
8             while(sum >= target) {
9                minlen = Math.min(minlen, r - l + 1);
10                sum -= nums[l];
11                l++;
12            }
13        }
14        return minlen == Integer.MAX_VALUE ? 0 : minlen;
15    }
16}