// Last updated: 08/09/2026, 13:18:59
1class Solution {
2    public int maxProduct(int[] nums) {
3        int pre=1,suf =1,maxi = Integer.MIN_VALUE;
4        int n=nums.length;
5        for(int i=0;i<n;i++){
6            if(pre == 0) pre =1;
7            if(suf == 0) suf =1;
8            pre *= nums[i];
9            suf *= nums[n-i-1];
10            maxi = Math.max(maxi,Math.max(pre,suf));
11            
12        }
13        return maxi ;
14    }
15}