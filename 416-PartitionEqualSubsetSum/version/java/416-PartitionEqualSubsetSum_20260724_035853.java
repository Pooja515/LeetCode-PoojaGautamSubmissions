// Last updated: 24/07/2026, 03:58:53
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
11       boolean[] dp = new boolean[target+1];
12     
13        for(int i = 0 ; i<n ; i++){
14            dp[0] = true;
15        }
16       
17        if(nums[0] <= target){
18            dp[nums[0]] = true;
19        }
20        
21        
22        
23        for(int ind = 1 ;ind < n ;ind++){
24              boolean[] cur = new boolean[target+1];
25            for(int t =1; t<= target;t++){
26                boolean notpick = dp[t];
27                boolean pick = false;
28                if(nums[ind] <= t){
29                    pick = dp[t - nums[ind]];
30                }
31
32                cur[t] = pick || notpick;
33            }
34            dp = cur;
35        }
36
37        return dp[target];
38    }
39
40}