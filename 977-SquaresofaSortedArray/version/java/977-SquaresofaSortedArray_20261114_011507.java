// Last updated: 14/11/2026, 01:15:07
1class Solution {
2    public int[] sortedSquares(int[] nums) {
3        int n = nums.length;
4        int l=0 , r=n-1,k=n-1;
5        int[] ans = new int[n];
6
7        while(l<=r){
8            if(Math.abs(nums[l]) > Math.abs(nums[r])){
9                ans[k--] = nums[l]*nums[l];
10                l++;
11            }
12            else{
13                 ans[k--] = nums[r]*nums[r];
14                 r--;
15            }
16        }
17        return ans;
18    }
19}