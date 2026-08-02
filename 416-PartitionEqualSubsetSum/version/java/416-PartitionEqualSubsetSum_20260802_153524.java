// Last updated: 02/08/2026, 15:35:24
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
16          //// Target 0 can always be formed by selecting nothing.
17          for(int ind = 0 ;ind < n; ind++){
18            dp[ind][0] = true;
19          }
20
21       for(int ind = 1 ;ind < n; ind++){
22        for(int t = 1 ;t <= target ; t++){
23            
24            boolean notpick = dp[ind-1][t];
25            boolean pick = false ;
26            if(nums[ind] <= t){
27                pick = dp[ind-1][t - nums[ind]];
28            }
29             dp[ind][t] = pick || notpick;
30        }
31      
32    
33       }
34    
35    return dp[n-1][target];
36    }
37}