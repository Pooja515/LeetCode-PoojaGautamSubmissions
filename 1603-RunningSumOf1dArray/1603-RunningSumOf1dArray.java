// Last updated: 28/06/2026, 01:02:03
class Solution {
    public int[] runningSum(int[] nums) {
        int n=nums.length,sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            nums[i]=sum;
        }
        return nums;
    }
}