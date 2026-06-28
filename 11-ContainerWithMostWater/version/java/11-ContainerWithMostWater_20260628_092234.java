// Last updated: 28/06/2026, 09:22:34
/*
 * Approach: Two-Pointer (Greedy)Core Idea: Place pointers at both ends (l = 0, r = n-1). The maximum water a container can hold is constrained by the shorter line and the distance between them:Area = min(height[l], height[r]) ) * (r - l).Pointer Movement Logic: At each step, calculate the area and update the maximum. Since moving the pointers inward decreases the width (r-l), we must greedily try to increase the height.If height[l] < height[r], increment l++.Otherwise, decrement r--.Note: Unlike typical two-pointer problems, the array does not need to be sorted because we dynamically optimize the bottleneck (the shorter bar) at every step.
 * Time Complexity : O(n) 
 * Space Complexity : O(1)
*/

1class Solution {
2    public int maxArea(int[] height) {
3       int n = height.length;
4       int l=0 , r=n-1 , maxi =0;
5       while(l<r){
6        int length = Math.min(height[l],height[r]);
7        int breadth = r - l;
8        int Area = length * breadth;
9        maxi = Math.max(maxi , Area);
10
11        if(height[l] < height[r]) l++;
12        else 
13              r--;
14       } 
15       return maxi;
16    }
17}