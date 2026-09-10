// Last updated: 11/09/2026, 05:18:18
1class Solution {
2    public void rotate(int[] nums, int k) {
3        int n = nums.length;
4        k = k % n;
5
6        reverse(0, n - 1, nums);
7        reverse(0, k - 1, nums);
8        reverse(k, n - 1, nums);
9
10    }
11
12    void reverse(int s, int e, int[] nums) {
13        while (s < e) {
14            int temp = nums[s];
15            nums[s] = nums[e];
16            nums[e] = temp;
17            s++;
18            e--;
19        }
20    }
21}