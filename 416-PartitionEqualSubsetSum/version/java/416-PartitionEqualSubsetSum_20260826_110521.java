// Last updated: 26/08/2026, 11:05:21
1class Solution {
2    Boolean[][] memo ;
3    public boolean canPartition(int[] nums) {
4
5        int n = nums.length, totalsum = 0;
6
7        for (int i = 0; i < n; i++) {
8            totalsum += nums[i];
9        }
10        if (totalsum % 2 != 0)
11            return false;
12
13        int target = totalsum / 2;
14
15         memo = new Boolean [n][target+1];
16
17
18        return f(n - 1, target, nums);
19    }
20
21    boolean f(int i, int target, int[] nums) {
22        if (target == 0){
23             return true;
24        }
25        if(i == 0){
26            if(nums[i] <= target ) return target == nums[i];
27            else
28                 return false;
29        }
30    
31    if(memo[i][target] != null) return memo[i][target];
32    boolean nottake = f(i - 1, target, nums);
33    boolean take = false;
34    if(nums[i] <= target){
35        take = f(i - 1, target - nums[i], nums);
36    }
37
38    return memo[i][target] = take||nottake;
39
40}
41}