// Last updated: 29/06/2026, 08:17:08
/*
 * Approach : memoization using memo array to cache overlapping subproblem 
 * Time Complexity : O(N)
 * Space Complexity : O(N) + O(N) => O(N)
*/

1class Solution {
2    int[] memo;
3    public int minCostClimbingStairs(int[] cost) {
4        int n = cost.length;
5        if(n<=1) return 0;
6
7        memo = new int[n+1];
8        Arrays.fill(memo , -1);
9
10        return f(n,cost);
11    }
12    int f(int n , int[] cost){
13        if(n <= 1) return 0;
14
15        if(memo[n] != -1) return memo[n];
16        int choice1 = f(n-1 , cost) + cost[n-1];
17        int choice2 = f(n-2 , cost ) + cost[n-2];
18
19        return memo[n] = Math.min(choice1 , choice2);
20    }
21}