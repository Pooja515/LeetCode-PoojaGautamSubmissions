// Last updated: 28/06/2026, 01:05:19
class Solution {
    public int[] searchRange(int[] nums, int target) {
        boolean isfirst=true;;
        int first=search(nums,target,isfirst);
        if(first==-1) return new int[]{-1,-1};
        int last=search(nums,target,false);
        return new int[]{first,last};
    }
    int search(int[] nums,int target,boolean isfirst){
          int low=0,high=nums.length-1,ans=-1;
          while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                if(isfirst){
                     ans=mid;
                     high=mid-1;
                }
                else{
                    ans=mid;
                    low=mid+1;
                }

            }
            else if(nums[mid]<target)
                 low=mid+1;
            else
                   high=mid-1;
          }
          return ans;
    }
}