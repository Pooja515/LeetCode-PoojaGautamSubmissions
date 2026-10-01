// Last updated: 02/10/2026, 00:47:19
1class Solution {
2    public int singleNonDuplicate(int[] nums) {
3       int n=nums.length ,xor=0;
4       for(int i=0;i<n;i++){
5          xor ^=nums[i];
6       } 
7       return xor;
8    }
9}