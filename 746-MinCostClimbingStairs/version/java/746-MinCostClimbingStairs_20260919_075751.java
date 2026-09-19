// Last updated: 19/09/2026, 07:57:51
1class Solution {
2
3    public int minCostClimbingStairs(int[] cost) {
4        int n = cost.length;
5
6        if (n < 2)
7            return Math.min(cost[0], cost[1]);
8
9      
10        int prev2 = cost[0];
11        int prev1 = cost[1] ;
12
13        for (int i = 2; i < n; i++) {
14          
15
16            int cur =cost[i]+ Math.min(prev1, prev2);
17            prev2 = prev1;
18            prev1 = cur;
19
20        }
21        return Math.min(prev2,prev1);
22
23    }
24
25}