// Last updated: 08/09/2026, 01:12:18
1class Solution {
2    public int[] productExceptSelf(int[] nums) {
3        int n = nums.length;
4       int[] ans = new int[n];
5       int pre=1,suf=1;
6       for(int i=0;i<n;i++){
7        ans[i] = pre;
8        pre *= nums[i];
9       } 
10       for(int r=n-1;r>=0;r--){
11         ans[r] *= suf;
12         suf *= nums[r];
13       }
14       return ans;
15    }
16}