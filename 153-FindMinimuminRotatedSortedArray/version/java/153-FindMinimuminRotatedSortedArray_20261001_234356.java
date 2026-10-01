// Last updated: 01/10/2026, 23:43:56
1class Solution {
2    public int findMin(int[] nums) {
3        int low=0,high=nums.length-1;
4        while(low<high){
5            int mid=low+(high-low)/2;
6            if(nums[mid]<nums[high]) high=mid;
7            else
8                  low=mid+1;
9        }
10        return nums[low];
11    }
12}