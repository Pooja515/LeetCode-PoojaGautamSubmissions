// Last updated: 28/06/2026, 01:03:58
class Solution {
    public int findPeakElement(int[] nums) {
        int low=0,high=nums.length-1,ans=-1;
        while(low<high){
            int mid=low+(high-low)/2;
            if(nums[mid]>nums[mid+1]){
                ans=mid;
                high=mid;
            }
            else
                 low=mid+1;
        }
        return low;
    }
}