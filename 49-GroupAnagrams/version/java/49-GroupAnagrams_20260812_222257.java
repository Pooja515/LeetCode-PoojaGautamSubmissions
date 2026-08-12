// Last updated: 12/08/2026, 22:22:57
1class Solution {
2    public int[] productExceptSelf(int[] nums) {
3       int pre = 1 , suff =1;
4       int n = nums.length;
5       int[] ans = new int[n];
6       for(int i=0;i<n;i++){
7           ans[i] = pre;
8           pre *= nums[i];
9       } 
10       for(int i=n-1 ;i>=0;i--){
11        ans[i] *= suff;
12        suff *= nums[i];
13       }
14       return ans;
15    }
16}