// Last updated: 05/11/2026, 02:16:20
1class Solution {
2    public int maxArea(int[] height) {
3        int n = height.length;
4        int l=0 , r=n-1 , maxarea = 0;
5        while(l<r){
6            int length= Math.min(height[l],height[r]);
7            int breadth = r-l;
8            int area = length * breadth;
9
10            maxarea=Math.max(maxarea,area);
11
12            if(height[l]<height[r]) l++;
13            else{
14                r--;
15            }
16        }
17        return maxarea;
18    }
19}