// Last updated: 20/08/2026, 10:08:45
1class Solution {
2    public int maxArea(int[] height) {
3        int maxi = 0, l = 0, r = height.length - 1;
4
5        while (l < r) {
6
7            if (height[l] < height[r]) {
8                int area = height[l] * (r - l);
9                maxi = Math.max(maxi, area);
10                l++;
11            } else {
12                int area = height[r] * (r - l);
13                maxi = Math.max(maxi, area);
14                r--;
15            }
16
17        }
18        return maxi;
19    }
20}