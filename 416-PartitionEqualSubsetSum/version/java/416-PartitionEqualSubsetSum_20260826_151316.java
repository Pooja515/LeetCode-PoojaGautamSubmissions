// Last updated: 26/08/2026, 15:13:16
1class Solution {
2
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
15        boolean [][] dp = new boolean [n][target+1];
16
17        for(int i =0;i<n;i++){
18            dp[i][0] = true;
19        }
20
21       
22            if(nums[0] <= target) {
23                dp[0][nums[0]] = true;
24            }
25           
26    
27    
28    for(int i=1;i<n;i++){
29        for(int t=0;t<= target;t++){
30              boolean nottake = dp[i - 1][t];
31              boolean take = false;
32              if(nums[i] <= t){
33                 take = dp[i - 1][t - nums[i]];
34                }
35
36               dp[i][t] = take||nottake;
37        }
38    }
39  
40     return dp[n-1][target];
41    }
42}