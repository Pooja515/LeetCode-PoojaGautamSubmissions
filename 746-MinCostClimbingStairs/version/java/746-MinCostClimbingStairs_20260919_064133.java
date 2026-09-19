// Last updated: 19/09/2026, 06:41:33
1class Solution {
2
3    public int minCostClimbingStairs(int[] cost) {
4        int n = cost.length;
5
6        if (n < 2)
7            return Math.min(cost[0], cost[1]);
8
9        int[] dp = new int[n ];
10        dp[0] = cost[0];
11        dp[1] = cost[1] ;
12
13        for (int i = 2; i < n; i++) {
14            int jump1 =  dp[i - 1];
15            int jump2 = dp[i - 2];
16
17            dp[i] =cost[i]+ Math.min(jump1, jump2);
18
19        }
20        return Math.min(dp[n-1],dp[n-2]);
21
22    }
23
24}