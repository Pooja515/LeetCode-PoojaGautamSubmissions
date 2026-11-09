// Last updated: 10/11/2026, 02:40:08
1class Solution {
2    public int search(int[] nums, int target) {
3        int n = nums.length;
4        int low = 0 , high=n-1;
5        while(low <= high){
6            int mid = low + (high - low)/2;
7            if(nums[mid] == target) return mid;
8            else if (nums[low] <= nums[mid]){
9                if(nums[low] <= target && target <= nums[mid]){
10                    high = mid -1;
11
12                }
13                else{
14                    low = mid +1;
15                }
16            }
17            else{
18                if(nums[mid] <= target && target <= nums[high]){
19                    low = mid+1;
20                }
21                else{
22                    high = mid-1;
23                }
24            }
25        }
26        return -1;
27    }
28}