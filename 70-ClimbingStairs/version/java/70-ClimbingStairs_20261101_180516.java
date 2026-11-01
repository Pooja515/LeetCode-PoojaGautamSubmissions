// Last updated: 01/11/2026, 18:05:16
1class Solution {
2    public int climbStairs(int n) {
3       if(n==0) return 0;
4
5       int prev2=1 , prev1 =1;
6       for(int i=2;i<=n;i++){
7           int cur = prev1 + prev2;
8           prev2 = prev1;
9           prev1 = cur;
10       }
11       return prev1;
12    }
13}