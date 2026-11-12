// Last updated: 12/11/2026, 08:08:31
1class Solution {
2    public int findPeakElement(int[] nums) {
3       int low =0 , high = nums.length-1;
4       while(low < high){
5        int mid = low + (high - low)/2;
6        
7        if(nums[mid]>nums[mid+1]){
8            high = mid;
9        }
10        else {
11            low = mid+1;
12        }
13       } 
14       return low;
15    }
16}