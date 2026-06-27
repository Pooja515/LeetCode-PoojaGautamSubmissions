// Last updated: 28/06/2026, 01:03:43
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int mini=Integer.MAX_VALUE;
        int n=nums.length;
        int l=0,sum=0;
        for(int r=0;r<n;r++){
           sum+=nums[r];
           while(sum>=target){
              mini=Math.min(mini,r-l+1);
              sum-=nums[l];
              l++;
           }
        }
        return mini==Integer.MAX_VALUE?0:mini;
    }
}