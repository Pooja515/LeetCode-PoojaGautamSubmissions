// Last updated: 13/08/2026, 00:30:52
1class Solution {
2    public int trap(int[] height) {
3        int n = height.length;
4        int trap = 0, lmax = 0, rmax = 0, l = 0, r = n - 1;
5        for (int i = 0; i < n; i++) {
6            lmax = Math.max(lmax, height[l]);
7            rmax = Math.max(rmax, height[r]);
8            if (lmax < rmax) {
9                trap += lmax - height[l];
10                l++;
11            } else {
12                trap += rmax - height[r];
13                r--;
14            }
15        }
16        return trap;
17
18    }
19}