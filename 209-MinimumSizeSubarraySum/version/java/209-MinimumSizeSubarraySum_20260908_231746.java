// Last updated: 08/09/2026, 23:17:46
1class Solution {
2    public int trap(int[] height) {
3       int trap = 0 , n= height.length, lmax=0,rmax=0,l=0,r=n-1;
4       while (l<=r){
5        lmax = Math.max(lmax,height[l]);
6        rmax = Math.max(rmax,height[r]);
7        if(lmax <= rmax){
8            trap += lmax-height[l];
9            l++;
10        }
11        else{
12            trap += rmax-height[r];
13            r--;
14        }
15       } 
16       return trap;
17    }
18}