// Last updated: 29/06/2026, 02:26:14
1class Solution {
2    public int fib(int n) {
3        if(n <= 1) return n;
4
5        int prev2 =0 , prev1 =1;
6
7        for(int i = 2 ;i <= n ; i++){
8            int cur  = prev1 + prev2;
9            prev2 = prev1;
10            prev1 = cur;
11        }
12        return prev1;  
13      }
14}