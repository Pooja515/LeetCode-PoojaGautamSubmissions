// Last updated: 07/09/2026, 01:43:53
1class Solution {
2    public void moveZeroes(int[] nums) {
3        int n = nums.length , i=0;
4        for(int j=0;j<n;j++){
5            if(nums[j] != 0){
6                nums[i++] = nums[j];
7               
8            }
9        }
10        while(i<n){
11            nums[i++] =0;
12        }
13    }
14}