// Last updated: 28/06/2026, 01:02:47
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int pro=1,cnt=0,l=0;
        if(k<=1) return 0;
        for(int r=0;r<nums.length;r++){
            pro*=nums[r];
            while(pro>=k){
               pro/=nums[l];
                l++;
            }
             cnt+=(r-l+1);   
            
        }
        return cnt;
    }
}