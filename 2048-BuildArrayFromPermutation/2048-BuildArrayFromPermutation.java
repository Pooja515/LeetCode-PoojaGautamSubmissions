// Last updated: 28/06/2026, 01:01:57
class Solution {
    public int[] buildArray(int[] nums) {
       int[] ans=new int[nums.length];
       for(int i=0;i<nums.length;i++){
        ans[i]=nums[nums[i]];
       } 
       return ans;
    }
}