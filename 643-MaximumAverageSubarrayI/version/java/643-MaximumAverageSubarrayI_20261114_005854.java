// Last updated: 14/11/2026, 00:58:54
1class Solution {
2    public double findMaxAverage(int[] nums, int k) {
3       double maxavg = Double.NEGATIVE_INFINITY;
4       int l=0 ;
5       double sum=0;
6       for(int r=0;r<nums.length;r++) {
7          sum += nums[r];
8          if(r-l+1 == k){
9            maxavg = Math.max(maxavg,sum);
10            sum -= nums[l];
11            l++;
12          }
13        
14       }
15       return maxavg/k ;
16    }
17}