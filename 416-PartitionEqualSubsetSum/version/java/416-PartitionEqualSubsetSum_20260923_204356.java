// Last updated: 23/09/2026, 20:43:56
1class Solution {
2    int[][] memo;
3    public boolean canPartition(int[] nums) {
4        int n = nums.length, totalsum = 0;
5        for (int num : nums) {
6            totalsum += num;
7        }
8
9        if (totalsum % 2 != 0) {
10            return false;
11        }
12
13        int target = totalsum / 2;
14        memo =new int[n][target+1];
15        for(int[] row:memo){
16            Arrays.fill(row,-1);
17        }
18
19        return f(n - 1, target, nums);
20    }
21    boolean f(int i , int target,int[] nums){
22        if(target == 0) return true;
23        if(i<0) return false;
24
25        if(memo[i][target] !=-1) return memo[i][target] == 1;
26
27        boolean notpick = f(i-1,target,nums);
28        boolean pick = false;
29        if(nums[i] <= target)
30            pick = f(i-1,target - nums[i],nums);
31
32        memo[i][target]=pick || notpick ? 1:0; 
33
34        return pick || notpick; 
35    }
36}