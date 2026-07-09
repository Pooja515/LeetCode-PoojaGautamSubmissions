// Last updated: 09/07/2026, 22:35:29
1class Solution {
2    int[] memo;
3    public int climbStairs(int n) {
4        if(n <= 1) return 1;
5        if(n==2) return n;
6        memo = new int[n+1] ;
7        Arrays.fill(memo , -1);
8        return f(n);
9    }
10    int f(int n){
11        if(n <=1) return 1;
12         if(n==2) return n;
13        if(memo[n] != -1) return memo[n];
14
15        return memo[n] = f(n-1) +f(n-2);
16    }
17}