// Last updated: 01/11/2026, 18:00:33
1class Solution {
2    public int climbStairs(int n) {
3       if(n==0) return 0;
4
5       int[] memo = new int[n+1];
6       Arrays.fill(memo,-1);
7
8       return f(n,memo); 
9    }
10    int f(int n,int[] memo){
11        if(n <= 2) return n;
12
13        if(memo[n] != -1) return memo[n];
14
15        return memo[n] = f(n-1,memo) + f(n-2,memo);
16    }
17}