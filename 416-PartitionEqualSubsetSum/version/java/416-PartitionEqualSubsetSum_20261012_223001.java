// Last updated: 12/10/2026, 22:30:01
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
21        if(n==1){
22            if(nums[0] <= target) return dp[0][nums[0]];
23        }
24    
25    for(int i=1;i<n;i++){
26        for(int t=0;t<= target;t++){
27              boolean nottake = dp[i - 1][t];
28              boolean take = false;
29              if(nums[i] <= t){
30                 take = dp[i - 1][t - nums[i]];
31                }
32
33               dp[i][t] = take||nottake;
34        }
35    }
36  
37     return dp[n-1][target];
38    }
39}