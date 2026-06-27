// Last updated: 28/06/2026, 01:05:36
class Solution {
    public int maxArea(int[] height) {
       int n=height.length;
       int l=0,r=n-1,maxi=Integer.MIN_VALUE;
       while(l<r){
        int len=Math.min(height[l],height[r]);
        int bre=r-l;
        maxi=Math.max(maxi,len*bre);
        if(height[l]<height[r]) l++;
        else
             r--;

       } 
       return maxi;
    }
}