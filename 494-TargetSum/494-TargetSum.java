// Last updated: 28/06/2026, 01:03:06
class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int n= nums.length;
        return f(n-1, target, nums);
    }
     int f(int i, int target , int[] nums){
        if(i==0){
            if(target == 0 && nums[0]== 0) return 2;
            if(target == nums[0] || target == -nums[0]) return 1;
            else
                   return 0;
        }
        int plus = f(i-1,target - nums[i],nums);
        int minus = f(i-1,target + nums[i],nums);

        return plus + minus;
     }
}