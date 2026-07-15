// Last updated: 16/07/2026, 01:56:36
1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        int n = nums.length;
4        for(int i =0 ;i<n ; i++){
5            for(int j = i+1 ; j<n ;j++){
6                if(nums[i] + nums[j] == target ){
7                    return new int[] {i,j};
8                }
9            }
10        }
11        return new int[] {-1,-1};
12    }
13}