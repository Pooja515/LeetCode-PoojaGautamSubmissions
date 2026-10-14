// Last updated: 15/10/2026, 00:53:28
1//Space optimization  Approach
2
3class Solution {
4    public int climbStairs(int n) {
5       int prev1 =1 , prev2 =1;
6
7       for(int i=2;i<=n;i++){
8           int cur = prev1 + prev2;
9           prev2 = prev1;
10           prev1 = cur;
11       } 
12       return prev1;
13    }
14}
15
16//T.C : O(N)
17//S.C : O(1) 