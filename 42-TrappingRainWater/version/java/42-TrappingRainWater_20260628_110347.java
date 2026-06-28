// Last updated: 28/06/2026, 11:03:47
/*
 * Approach: Two-Pointer (Greedy)
 * Core Idea: Track the boundary maximums from both ends (lmax from the left, rmax from the right) using two pointers (l = 0, r = n-1). The water trapped at any index is limited by the smaller of the two boundaries.
 * 
 * Pointer Movement Logic: Compare lmax and rmax at each step:
 * 
 * If lmax < rmax: The left side is the bottleneck. We can safely calculate the water trapped at l using lmax - height[l], then move l++.
 * 
 * Otherwise: The right side is the bottleneck. Calculate water trapped at r using rmax - height[r], then move r--.
 * 
 * Why it works: By moving the pointer with the smaller maximum boundary, we guarantee that we don't need to know the exact maximums on the far side—the water level is already capped by the smaller side.
 * Time complexity : O(N) 
 * Space Complexity : O(1)
*/

1class Solution {
2    public int trap(int[] height) {
3        int n = height.length;
4        int l = 0 , r = n-1;
5        int lmax = 0 , rmax = 0 , trap =0;
6        while(l < r){
7            lmax = Math.max(lmax , height[l]);
8            rmax = Math.max(rmax , height[r]);
9            if(lmax < rmax){
10                trap += lmax - height[l];
11                l++; 
12            }
13            else{
14                trap += rmax - height[r];
15                r--;
16            }
17        }
18        return trap;
19    }
20}