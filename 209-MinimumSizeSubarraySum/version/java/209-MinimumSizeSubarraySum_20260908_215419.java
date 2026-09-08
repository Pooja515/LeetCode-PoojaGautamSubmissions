// Last updated: 08/09/2026, 21:54:19
1class Solution {
2    public int missingNumber(int[] nums) {
3        int n = nums.length , xor =n;
4        for(int i=0;i<n;i++){
5            xor ^= nums[i] ^ i;
6        }
7        return xor;
8    }
9}