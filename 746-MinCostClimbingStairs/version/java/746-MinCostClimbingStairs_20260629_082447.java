// Last updated: 29/06/2026, 08:24:47
/*
 * Approach : using variables to store the and optimize space from dp array 
 * Time complexity : O(N)
 * Space Complexity : O(1)
*/

1class Solution {
2    
3    public int minCostClimbingStairs(int[] cost) {
4        int n = cost.length;
5        if(n<=1) return 0;
6        
7        int prev2 =0 , prev1=0;
8
9       for(int i = 2;i<=n;i++){
10           int choice1 = prev1+ cost[i-1];
11           int choice2 = prev2 + cost[i-2];
12
13          int cur = Math.min(choice1 , choice2);
14          prev2  = prev1;
15          prev1 = cur;
16       }
17       return prev1;
18    }
19}