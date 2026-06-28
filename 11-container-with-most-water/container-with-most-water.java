class Solution {
    public int maxArea(int[] height) {
       int n = height.length;
       int l=0 , r=n-1 , maxi =0;
       while(l<r){
        int length = Math.min(height[l],height[r]);
        int breadth = r - l;
        int Area = length * breadth;
        maxi = Math.max(maxi , Area);

        if(height[l] < height[r]) l++;
        else 
              r--;
       } 
       return maxi;
    }
}