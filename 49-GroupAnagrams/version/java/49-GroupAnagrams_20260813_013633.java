// Last updated: 13/08/2026, 01:36:33
1class Solution {
2    public int fib(int n) {
3        if(n <= 1) return n;
4        int[] dp = new int[n+1];
5        int prev2 =0 , prev1 =1;
6        for(int i=2;i<=n;i++){
7            int cur = prev1 + prev2;
8            prev2 = prev1;
9            prev1 = cur;
10        }
11        return prev1;
12    }
13}