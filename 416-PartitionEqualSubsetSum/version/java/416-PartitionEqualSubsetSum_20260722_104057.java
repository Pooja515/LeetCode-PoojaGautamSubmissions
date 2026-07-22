// Last updated: 22/07/2026, 10:40:57
1class Solution {
2    
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
13
14        boolean[][] dp = new boolean [n][target + 1];
15
16          for(int ind = 0 ;ind < n; ind++){
17            dp[ind][0] = true;
18          }
19
20       for(int ind = 1 ;ind < n; ind++){
21        for(int t = 1 ;t <= target ; t++){
22            
23            boolean notpick = dp[ind-1][t];
24            boolean pick = false ;
25            if(nums[ind] <= t){
26                pick = dp[ind-1][t - nums[ind]];
27            }
28             dp[ind][t] = pick || notpick;
29        }
30      
31    
32       }
33    
34    return dp[n-1][target];
35    }
36}