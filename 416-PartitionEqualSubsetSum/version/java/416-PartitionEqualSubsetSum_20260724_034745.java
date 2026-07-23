// Last updated: 24/07/2026, 03:47:45
1class Solution {
2    Boolean[][] memo ;
3    public boolean canPartition(int[] nums) {
4      int n = nums.length;
5      int totalsum = 0;
6      for(int i = 0 ; i < n ;i++){
7        totalsum += nums[i];
8      }
9      if(totalsum % 2 != 0) return false; 
10      int target = totalsum/2; 
11      memo = new Boolean[n][target+1];
12      return f(n-1,target , nums);
13    }
14
15    boolean f(int ind , int target , int[] nums){
16        if(target == 0) return true;
17        if(ind == 0){
18          
19                return nums[0] == target;
20            
21        }
22        if(memo[ind][target] != null) return memo[ind][target];
23        boolean notpick = f(ind-1 , target , nums);
24        boolean pick = false;
25        if(nums[ind] <= target){
26            pick = f(ind-1 , target - nums[ind] , nums);
27        }
28
29        return memo[ind][target] = pick || notpick;
30    }
31
32}