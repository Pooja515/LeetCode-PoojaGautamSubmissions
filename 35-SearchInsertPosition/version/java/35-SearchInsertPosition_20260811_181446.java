// Last updated: 11/08/2026, 18:14:46
1class Solution {
2    public int searchInsert(int[] nums, int target) {
3        int low = 0, high = nums.length - 1;
4        while(low <= high){
5            int mid = low + (high - low) /2;
6            if(nums[mid] == target) return mid;
7            if(nums[mid] < target) low = mid+1;
8            else
9                  high=mid-1;
10        }
11        return low;
12    }
13}