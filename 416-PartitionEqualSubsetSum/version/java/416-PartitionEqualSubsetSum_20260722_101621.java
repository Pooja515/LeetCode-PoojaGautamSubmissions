// Last updated: 22/07/2026, 10:16:21
1class Solution {
2    Boolean[][] memo;
3    public boolean canPartition(int[] nums) {
4        int totalsum = 0;
5        for(int num : nums){
6            totalsum += num;
7        }
8
9        if(totalsum % 2 != 0) return false;
10
11        int target = totalsum / 2 ;
12        int n = nums.length;
13        memo = new Boolean[n][target + 1];
14
15       
16        return f(n-1 , nums, target);
17    }
18
19    boolean f(int ind , int[] nums, int target){
20       if(target == 0) return true;
21       if(ind < 0) return false;
22       if(memo[ind][target] != null) return memo[ind][target];
23       boolean notpick = f(ind-1,nums , target);
24       boolean pick = false ;
25       if(nums[ind] <= target){
26         pick = f(ind-1 , nums , target - nums[ind]);
27       }
28
29       return memo[ind][target] = pick || notpick;
30
31    }
32}