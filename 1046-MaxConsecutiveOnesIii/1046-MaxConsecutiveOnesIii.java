// Last updated: 28/06/2026, 01:02:17
class Solution {
    public int longestOnes(int[] nums, int k) {
        int l=0,zerocnt=0,maxi=0;
        for(int r=0;r<nums.length;r++){
            if(nums[r]==0) zerocnt++;
            while(zerocnt>k){
                if(nums[l]==0) zerocnt--;
                l++;
            }
            maxi=Math.max(maxi,r-l+1);
        }
        return maxi;
    }
}