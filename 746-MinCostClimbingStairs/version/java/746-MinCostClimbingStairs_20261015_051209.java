// Last updated: 15/10/2026, 05:12:09
1class Solution {
2
3    public int minCostClimbingStairs(int[] cost) {
4        int n = cost.length;
5
6        int[] memo = new int[n + 1];
7
8        Arrays.fill(memo, -1);
9
10        return f(n, cost, memo);
11    }
12
13    int f(int ind, int[] cost, int[] memo) {
14
15        if (ind <= 1)
16            return 0;
17
18        if (memo[ind] != -1)
19            return memo[ind];
20
21        int climb1 = f(ind - 1, cost, memo) + cost[ind - 1];
22        int climb2 = Integer.MAX_VALUE;
23        if (ind > 1) {
24            climb2 = f(ind - 2, cost, memo) + cost[ind - 2];
25        }
26
27        return memo[ind] = Math.min(climb1, climb2);
28    }
29}