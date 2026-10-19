// Last updated: 19/10/2026, 14:54:00
1class Solution {
2    public int fib(int n) {
3      if(n<=1) return n;
4
5      return fib(n-1)+fib(n-2);  
6    }
7}