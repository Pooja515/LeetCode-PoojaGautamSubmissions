// Last updated: 27/07/2026, 00:52:08
1class Solution {
2    public double findMaxAverage(int[] nums, int k) {
3       int l=0 ;
4       double sum = 0 , maxi =  Double.NEGATIVE_INFINITY;
5       for(int r=0;r<nums.length;r++){
6        sum +=nums[r];
7        if(r-l+1 == k){
8            double avg = sum/k;
9            maxi = Math.max(maxi , avg);
10            sum -= nums[l];
11            l++;
12        }
13       } 
14       return maxi;
15    }
16}