// Last updated: 02/11/2026, 02:54:51
1class Solution {
2    public int trap(int[] height) {
3        int trapped = 0;
4        int l = 0 ,r = height.length-1 ,lmax = 0 ,rmax = 0;
5
6        while(l<r){
7            lmax = Math.max(lmax , height[l]);
8            rmax = Math.max(rmax , height[r]);
9
10            if(lmax < rmax){
11                trapped += lmax-height[l];
12                l++;
13            }
14            else{
15                trapped += rmax-height[r];
16                r--;
17            }
18        }
19        return trapped;
20    }
21}