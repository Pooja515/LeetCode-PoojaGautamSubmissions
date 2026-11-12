// Last updated: 12/11/2026, 07:49:10
1class Solution {
2    public int maxProduct(int[] nums) {
3        int n= nums.length , pre=1 , suff=1 , maxpro=Integer.MIN_VALUE;
4
5        for(int i=0;i<n;i++){
6            if(pre ==0) pre=1;
7            if(suff==0) suff=1;
8            pre *= nums[i];
9            suff *= nums[n-i-1];
10
11            int pro = Math.max(pre,suff);
12            maxpro = Math.max(maxpro , pro);
13        }
14        return maxpro;
15    }
16}