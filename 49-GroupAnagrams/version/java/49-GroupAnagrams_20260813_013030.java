// Last updated: 13/08/2026, 01:30:30
1class Solution {
2    public int fib(int n) {
3        if(n <= 1) return n;
4        int[] memo = new int[n+1];
5        Arrays.fill(memo , -1);
6        
7        return f(n,memo);
8    }
9    int f(int n , int[] memo){
10        if(n <= 1) return n;
11
12        if(memo[n] != -1) return memo[n];
13
14        return f(n-1 , memo) + f(n-2,memo);
15    }
16}