// Last updated: 15/10/2026, 04:57:12
1class Solution {
2    
3    public int minCostClimbingStairs(int[] cost) {
4        int n = cost.length;
5        if(n<2) return Math.min(cost[0],cost[1]);
6        
7        int prev2 =0 , prev1=0;
8
9       for(int i = 2;i<=n;i++){
10           int climb1 = prev1+ cost[i-1];
11           int climb2 = prev2 + cost[i-2];
12
13          int cur = Math.min(climb1 , climb2);
14          prev2  = prev1;
15          prev1 = cur;
16       }
17       return prev1;
18    }
19}