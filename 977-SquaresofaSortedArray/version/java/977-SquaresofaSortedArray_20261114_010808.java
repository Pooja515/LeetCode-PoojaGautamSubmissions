// Last updated: 14/11/2026, 01:08:08
1class Solution {
2    public int[] sortedSquares(int[] nums) {
3        int[] ans = new int[nums.length];
4        for (int i = 0; i < nums.length; i++) {
5            ans[i] = nums[i] * nums[i];
6        }
7        Arrays.sort(ans);
8        return ans;
9    }
10}