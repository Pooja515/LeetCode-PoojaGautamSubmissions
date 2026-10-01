// Last updated: 01/10/2026, 18:21:00
1class Solution {
2    public int search(int[] nums, int target) {
3        int n = nums.length;
4        int low = 0, high = n - 1;
5
6        while (low <= high) {
7            int mid = low + (high - low) / 2;
8            if (nums[mid] == target)
9                return mid;
10            else if (nums[low] <= nums[mid]) {
11                if (target >= nums[low] && target <= nums[mid]) {
12                    high = mid - 1;
13                } else {
14                    low = mid + 1;
15                }
16            } else {
17                if (target >= nums[mid] && target <= nums[high]) {
18                    low = mid + 1;
19                } else
20                    high = mid - 1;
21            }
22        }
23        return -1;
24    }
25}