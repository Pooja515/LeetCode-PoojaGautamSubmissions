// Last updated: 06/10/2026, 00:47:28
1class Solution {
2    public int findPeakElement(int[] nums) {
3        int n = nums.length;
4        int low=0,high=n-1;
5        while(low<high){
6            int mid = low +(high-low)/2;
7            if(nums[mid]>nums[mid+1]){
8                high=mid;
9            }
10            else{
11                low=mid+1;
12            }
13        }
14        return low;
15    }
16}