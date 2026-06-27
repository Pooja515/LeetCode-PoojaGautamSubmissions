// Last updated: 28/06/2026, 01:04:06
class Solution {
    public int maxProduct(int[] nums) {
        int maxpro=Integer.MIN_VALUE,n=nums.length;
        int pre=1,suff=1;
        for(int i=0;i<nums.length;i++){
            if(pre==0) pre=1;
            if(suff==0) suff=1;
              pre*=nums[i];
              suff*=nums[n-i-1];
              maxpro=Math.max(maxpro,Math.max(pre,suff));

        }
        return maxpro;
    }
}