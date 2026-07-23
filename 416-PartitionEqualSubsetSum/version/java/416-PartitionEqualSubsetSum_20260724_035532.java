// Last updated: 24/07/2026, 03:55:32
1class Solution {
2
3    public boolean canPartition(int[] nums) {
4      int n = nums.length;
5      int totalsum = 0;
6      for(int i = 0 ; i < n ;i++){
7        totalsum += nums[i];
8      }
9      if(totalsum % 2 != 0) return false; 
10      int target = totalsum/2; 
11       boolean[][] dp = new boolean[n][target+1];
12     
13        for(int i = 0 ; i<n ; i++){
14            dp[i][0] = true;
15        }
16        if(n == 1){
17            if(nums[0] <= target){
18               dp[0][nums[0]] = true;
19            }
20        }
21        
22        
23        for(int ind = 1 ;ind < n ;ind++){
24            for(int t =1; t<= target;t++){
25                boolean notpick = dp[ind-1][t];
26                boolean pick = false;
27                if(nums[ind] <= t){
28                    pick = dp[ind-1][t - nums[ind]];
29                }
30
31                dp[ind][t] = pick || notpick;
32            }
33        }
34
35        return dp[n-1][target];
36    }
37
38}