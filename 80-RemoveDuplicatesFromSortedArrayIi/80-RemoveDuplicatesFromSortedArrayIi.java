// Last updated: 28/06/2026, 01:04:48
class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        if(n<=2) return n;
        int i=2;
        for(int j=2;j<nums.length;j++){
            if(nums[i-2]!=nums[j]){
                nums[i]=nums[j];
                i++;
            }
        }
        return i;
    }
}