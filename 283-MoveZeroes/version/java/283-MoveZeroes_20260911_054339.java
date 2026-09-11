// Last updated: 11/09/2026, 05:43:39
1class Solution {
2    public void moveZeroes(int[] nums) {
3        int n = nums.length;
4        int j=0;
5        for(int i=0;i<n;i++){
6            if(nums[i] != 0){
7               nums[j++] = nums[i];
8
9            }
10        }
11        while(j<n){
12            nums[j++] = 0;
13        }
14    }
15}