// Last updated: 28/06/2026, 01:02:50
class Solution {
    public double findMaxAverage(int[] nums, int k) {
       int l=0;
       int sum=0,maxi=Integer.MIN_VALUE;
       for(int r=0;r<nums.length;r++){
         sum+=nums[r];
         if((r-l+1)==k){
            maxi=Math.max(maxi,sum);
            sum-=nums[l];
            l++;
         }
       }
       return (double) maxi/k;
    }
}
