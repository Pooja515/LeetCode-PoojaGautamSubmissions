// Last updated: 03/10/2026, 15:54:49
1class Solution {
2    public int mySqrt(int x) {
3        int low=1,high=x,ans=x;
4        while(low<=high){
5            int mid=low+(high-low)/2;
6            if((long)mid*mid<=x){
7                ans=mid;
8                low=mid+1;
9            }
10            else
11                 high=mid-1;
12        }
13        return ans;
14    }
15}