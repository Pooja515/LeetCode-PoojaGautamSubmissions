// Last updated: 24/10/2026, 20:16:20
1class Solution {
2    public long countSubarrays(int[] nums, int minK, int maxK) {
3        int n = nums.length;
4        int lastInvalid = -1;
5        long count = 0;
6
7        int[] res = nums;
8
9        for (int i = 0; i < n; i++) {
10            if (res[i] < minK || res[i] > maxK) {
11                lastInvalid = i;
12            } else {
13                count += i - lastInvalid;
14            }
15        }
16
17        return count;
18    }
19}
20