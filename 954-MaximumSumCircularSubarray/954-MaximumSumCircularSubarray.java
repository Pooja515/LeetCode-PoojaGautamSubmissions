// Last updated: 28/06/2026, 01:02:25
class Solution {
    public int maxSubarraySumCircular(int[] nums) {
       int totalsum=0,sum1=0,sum2=0;
       int maxi=Integer.MIN_VALUE,mini=Integer.MAX_VALUE;
       for(int r=0;r<nums.length;r++){
        totalsum+=nums[r];

        sum1+=nums[r];
        maxi=Math.max(maxi,sum1);
        if(sum1<0) sum1=0;

        sum2+=nums[r];
        mini=Math.min(mini,sum2);
        if(sum2>0) sum2=0;

       }
       if(maxi<0) return maxi ;
       return Math.max(maxi,totalsum-mini);

    }
}