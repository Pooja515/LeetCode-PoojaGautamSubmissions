// Last updated: 20/08/2026, 10:05:48
1class Solution {
2    public int maxArea(int[] height) {
3        int maxi = 0, l = 0, r = height.length - 1;
4
5        while (l < r) {
6            int length = Math.min(height[l], height[r]);
7            int area = length * (r - l);
8            maxi = Math.max(maxi, area);
9            if(height[l] <height[r]) l++;
10            else
11                  r--;
12
13        }
14        return maxi;
15    }
16}