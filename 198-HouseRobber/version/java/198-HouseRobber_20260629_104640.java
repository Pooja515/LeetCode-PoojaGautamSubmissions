// Last updated: 29/06/2026, 10:46:40
1class Solution {
2  
3    public int rob(int[] nums) {
4        int n = nums.length;
5        int[] dp= new int[n];
6        
7        if(n==1) return nums[0];
8
9        dp[0] = nums[0];
10        dp[1] = Math.max(nums[0] , nums[1]);
11        for(int i = 2;i<n ; i++){
12                int pick = nums[i] + dp[i-2];
13                int notpick = 0 + dp[i-1];
14
15                dp[i] = Math.max(pick , notpick);
16        }
17    return dp[n-1];
18    }
19}