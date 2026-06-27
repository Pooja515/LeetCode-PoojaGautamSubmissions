// Last updated: 28/06/2026, 01:03:25
class Solution {
    public void moveZeroes(int[] nums) {
       int i = 0;
       for(int j=0 ;j<nums.length;j++){
        if(nums[j] != 0){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
        }
       } 
    }
}