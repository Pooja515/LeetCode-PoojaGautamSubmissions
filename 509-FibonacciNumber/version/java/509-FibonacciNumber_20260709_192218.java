// Last updated: 09/07/2026, 19:22:18
1class Solution {
2    public int fib(int n) {
3        if(n<=1) return n;
4
5        return fib(n-1) + fib(n-2);
6    }
7}