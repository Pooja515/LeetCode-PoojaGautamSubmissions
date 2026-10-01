// Last updated: 01/10/2026, 23:00:44
1class Solution {
2    public boolean search(int[] nums, int target) {
3       int n = nums.length;
4        int low = 0, high = n - 1;
5
6        while (low <= high) {
7            int mid = low + (high - low) / 2;
8            if (nums[mid] == target)
9                return true;
10            if(nums[low]==nums[mid] && nums[mid]==nums[high]){
11            low++;
12            high--;
13            continue;
14        }
15            else if (nums[low] <= nums[mid]) {
16                if (target >= nums[low] && target <= nums[mid]) {
17                    high = mid - 1;
18                } else {
19                    low = mid + 1;
20                }
21            } else {
22                if (target >= nums[mid] && target <= nums[high]) {
23                    low = mid + 1;
24                } else
25                    high = mid - 1;
26            }
27        }
28        return false; 
29    }
30}