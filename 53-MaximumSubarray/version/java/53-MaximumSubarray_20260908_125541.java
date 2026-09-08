// Last updated: 08/09/2026, 12:55:41
1class Solution {
2    public int maxSubArray(int[] nums) {
3        int maxi =Integer.MIN_VALUE , sum =0;
4        for(int i=0;i<nums.length;i++){
5           sum += nums[i];
6           maxi = Math.max(sum,maxi);
7           if(sum<0) sum = 0;
8        }
9        return maxi;
10    }
11}