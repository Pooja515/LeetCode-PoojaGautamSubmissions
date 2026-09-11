// Last updated: 11/09/2026, 05:59:16
1class Solution {
2    public int missingNumber(int[] nums) {
3        int n = nums.length;
4        int xor = n;
5        for(int i=0;i<n;i++){
6            xor ^= nums[i] ^ i;
7        }
8        return xor;
9    }
10}