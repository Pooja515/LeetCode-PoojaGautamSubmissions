// Last updated: 22/07/2026, 07:43:55
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
16        return f(0 , nums, target);
17    }
18
19    boolean f(int i , int[] nums, int target){
20        if(target == 0) return true;
21        if(i == nums.length)
22           return false;
23          if (memo[i][target] != null) {
24            return memo[i][target];
25        }
26        boolean nottake = f(i+1 , nums , target);
27        boolean take = false;
28        if(nums[i] <= target){
29            take = f(i+1 , nums , target - nums[i]);
30        }
31         return memo[i][target] =  nottake || take;
32    }
33}
34
35
36