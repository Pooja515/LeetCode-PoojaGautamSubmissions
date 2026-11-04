// Last updated: 04/11/2026, 06:11:35
1class Solution {
2    public int singleNumber(int[] nums) {
3        int xor = 0;
4        for(int i=0;i<nums.length;i++){
5            xor ^= nums[i];
6        }
7        return xor;
8    }
9}