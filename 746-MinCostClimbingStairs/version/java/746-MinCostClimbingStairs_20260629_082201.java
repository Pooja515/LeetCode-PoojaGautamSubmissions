// Last updated: 29/06/2026, 08:22:01
/*
 * Approach : Tabulation  (DP ) this approach optimizes space by avoiding recursive calls overhead
 * 
 * Time Complexity : O(N)
 * Space Complexity : O(N) // USING DP Array
*/

1class Solution {
2    
3    public int minCostClimbingStairs(int[] cost) {
4        int n = cost.length;
5        if(n<=1) return 0;
6
7        int[] dp  = new int[n+1];
8        
9        dp[0] =0;
10        dp[1] =0;
11
12       for(int i = 2;i<=n;i++){
13           int choice1 = dp[i-1] + cost[i-1];
14           int choice2 = dp[i-2] + cost[i-2];
15
16          dp[i] = Math.min(choice1 , choice2);
17       }
18       return dp[n];
19    }
20}