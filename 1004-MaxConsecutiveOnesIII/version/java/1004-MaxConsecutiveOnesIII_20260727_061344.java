// Last updated: 27/07/2026, 06:13:44
1class Solution {
2    public double findMaxAverage(int[] nums, int k) {
3       int l=0 ;
4       double sum = 0 , maxi =  Double.NEGATIVE_INFINITY;
5       for(int r=0;r<nums.length;r++){
6        sum +=nums[r];
7        if(r-l+1 == k){
8            maxi = Math.max(maxi , sum);
9            sum -= nums[l];
10            l++;
11        }
12       } 
13       return maxi/k;
14    }
15}