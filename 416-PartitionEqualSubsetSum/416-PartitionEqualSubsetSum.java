// Last updated: 28/06/2026, 01:03:12
class Solution {
    public boolean canPartition(int[] nums) {
        int totalsum = 0;
        for(int num : nums){
            totalsum += num;
        }

        if(totalsum % 2 != 0) return false;

        int target = totalsum / 2 ;
        int n = nums.length;
        boolean [][] dp = new boolean [n][target +1];

         for(int i=0 ; i<n; i++){
             dp[i][0] = true;
         }
        if(nums[0] <= target) 
             dp[0][nums[0]] = true;   
        
        for(int i=1 ; i<n; i++){
            for(int t=0;t <= target; t++){
                 boolean nottake = dp[i-1][t];
                 boolean take = false;
                 if(nums[i] <= t){
                     take = dp[i-1][t - nums[i]];
                  }

                dp[i][t] = nottake || take ;
            }
        }
  return dp[n-1][target];
    }
}