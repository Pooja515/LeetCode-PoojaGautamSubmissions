// Last updated: 30/09/2026, 15:56:02
1class Solution {
2    public int maxProduct(int[] nums) {
3        int n = nums.length;
4        int pre=1,suff=1,ans=Integer.MIN_VALUE;
5      for(int i=0;i<n;i++){
6        if(pre == 0) pre=1;
7        if(suff == 0) suff =1;
8            
9            pre *= nums[i];
10            suff *= nums[n-i-1];
11            ans= Math.max(ans,Math.max(pre,suff));
12        }
13        return ans;
14    }
15}