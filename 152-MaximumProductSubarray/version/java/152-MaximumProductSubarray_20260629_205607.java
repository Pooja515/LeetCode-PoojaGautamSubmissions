// Last updated: 29/06/2026, 20:56:07
1class Solution {
2    public int maxProduct(int[] nums) {
3       int prefix =1 , suffix =1, n = nums.length , maxi = Integer.MIN_VALUE;
4       for(int i =0; i<n ; i++){
5        if(prefix == 0) prefix = 1;
6        if(suffix == 0) suffix = 1;
7        prefix *= nums[i];
8        suffix *= nums[n-i-1];
9        maxi = Math.max(maxi , Math.max(prefix , suffix));
10       } 
11       return maxi;
12    }
13}