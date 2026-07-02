// Last updated: 02/07/2026, 13:45:55
1class Solution {
2    public int maxProduct(int[] nums) {
3        int suffix =1 , prefix =1, maxi=Integer.MIN_VALUE;
4        int n = nums.length;
5        for(int i=0;i<n;i++){
6            if(prefix == 0){
7                prefix = 1;
8            }
9            if(suffix == 0){
10                suffix = 1;
11            }
12            prefix *= nums[i];
13            suffix *= nums[n-i-1];
14            maxi = Math.max(maxi, Math.max(prefix,suffix));
15        }
16        return maxi;
17    }
18}