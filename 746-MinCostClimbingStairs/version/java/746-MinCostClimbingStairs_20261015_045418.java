// Last updated: 15/10/2026, 04:54:18
1class Solution {
2
3    public int minCostClimbingStairs(int[] cost) {
4        int n = cost.length;
5
6        if (n < 2)
7            return Math.min(cost[0], cost[1]);
8
9        int prev2 = cost[0] ,prev1 = cost[1];
10
11        for (int ind = 2; ind < n; ind++) {
12
13            int cur = cost[ind] + Math.min(prev1, prev2);
14            prev2 = prev1;
15            prev1 = cur;
16
17        }
18
19        return Math.min(prev1,prev2);
20
21    }
22}