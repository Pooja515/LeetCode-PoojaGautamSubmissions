// Last updated: 19/09/2026, 06:05:03
1class Solution {
2    int[] memo;
3    public int minCostClimbingStairs(int[] cost) {
4        int n = cost.length;
5        memo= new int[n+1];
6        Arrays.fill(memo,-1);
7        
8        if(n<2) return Math.min(cost[0],cost[1]);
9       
10
11        return f(n,cost);
12    }
13    int f(int i,int[] cost){
14        if(i<=1) return 0;
15
16        if(memo[i] != -1) return memo[i];
17
18        int jump1 = cost[i-1] + f(i-1,cost);
19        int jump2 = cost[i-2] + f(i-2,cost);
20
21        return  memo[i] = Math.min(jump1,jump2);
22    }
23
24}