// Last updated: 09/07/2026, 19:25:30
1class Solution {
2    int[] memo;
3    public int fib(int n) {
4        if(n<=1) return n;
5        memo = new int[n+1];
6        Arrays.fill(memo , -1);
7
8        return f(n);
9    }
10    int f(int n){
11        if(n <= 1) return n;
12
13        if(memo[n] != -1) return memo[n];
14
15        return memo[n] = f(n-1)+f(n-2);
16    }
17}