// Last updated: 11/11/2026, 02:34:21
1class Solution {
2    public int numSubarrayProductLessThanK(int[] nums, int k) {
3        if(k <= 1) return 0;;  
4        int l=0, maxlen =0, pro=1;
5        for(int r=0;r<nums.length;r++){
6            pro *= nums[r];
7            while(pro >= k){
8                pro /=  nums[l];
9                l++;
10            }
11           
12            maxlen += (r-l+1);
13        }
14        return  maxlen;
15    }
16}