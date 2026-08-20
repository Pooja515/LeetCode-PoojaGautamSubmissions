// Last updated: 20/08/2026, 06:20:33
1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        int n = nums.length;
4        for(int i=0;i<n-1;i++){
5            for(int j=i+1;j<n;j++){
6                if(nums[i]+nums[j] == target) return new int[] {i,j};
7            }
8        }
9        return new int[] {-1,-1};
10    }
11}