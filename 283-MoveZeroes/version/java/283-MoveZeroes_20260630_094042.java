// Last updated: 30/06/2026, 09:40:42
1class Solution {
2    public void moveZeroes(int[] nums) {
3        int i=0;
4        for(int j =0;j<nums.length;j++){
5            if(nums[j] != 0){
6                int temp = nums[i];
7                nums[i] = nums[j];
8                nums[j] = temp;
9                i++;
10            }
11        }
12    }
13}