// Last updated: 05/10/2026, 17:09:58
1class Solution {
2    public int smallestDivisor(int[] nums, int threshold) {
3        int n = nums.length;
4        int low = 1, high = 1;
5        for (int num : nums) {
6            high = Math.max(high, num);
7        }
8        int ans = high;
9
10        while (low <= high) {
11            int mid = low + (high - low) / 2;
12
13            if (isvalid(mid, nums, threshold)) {
14                ans = mid;
15                high = mid - 1;
16               
17            } else {
18                low = mid + 1;
19            }
20        }
21        return ans;
22    }
23
24    boolean isvalid(int mid, int[] nums, int threshold) {
25        int sum = 0;
26        for (int num : nums) {
27            sum += num / mid;
28            if (num % mid != 0) {
29                sum += 1;
30            }
31            if(sum > threshold) return false;
32        }
33        return true;
34    }
35}
36