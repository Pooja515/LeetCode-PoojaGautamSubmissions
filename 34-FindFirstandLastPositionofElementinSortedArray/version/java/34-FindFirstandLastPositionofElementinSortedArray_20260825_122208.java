// Last updated: 25/08/2026, 12:22:08
1class Solution {
2    public int[] searchRange(int[] nums, int target) {
3        boolean isfirst = true;
4        int n = nums.length;
5        int low = 0, high = n - 1;
6        int first = f(0, n - 1, nums, target, true);
7        if (first == -1)
8            return new int[] { -1, -1 };
9        int second = f(0, n - 1, nums, target, false);
10        return new int[] { first, second };
11    }
12
13    int f(int low, int high, int[] nums, int target, boolean istrue) {
14        int ans = -1;
15        while (low <= high) {
16
17            int mid = low + (high - low) / 2;
18            if (istrue) {
19                if (nums[mid] == target) {
20                    ans = mid;
21                    high = mid - 1;
22                } else if (nums[mid] < target)
23                    low = mid + 1;
24                else
25                    high = mid - 1;
26            } else {
27                if (nums[mid] == target) {
28                    ans = mid;
29                    low = mid + 1;
30                } else if (nums[mid] < target)
31                    low = mid + 1;
32                else
33                    high = mid - 1;
34
35            }
36        }
37        return ans;
38    }
39}