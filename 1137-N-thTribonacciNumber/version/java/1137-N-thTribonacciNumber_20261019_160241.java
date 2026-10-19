// Last updated: 19/10/2026, 16:02:41
1class Solution {
2    public int tribonacci(int n) {
3        if(n==0) return 0;
4        if(n==1 || n==2) return 1;
5
6        int[] dp=new int[n+1];
7        dp[0]=0;
8        dp[1]=1;
9        dp[2]=1;
10
11        for(int i=3;i<=n;i++){
12           dp[i]= dp[i-1] + dp[i-2] + dp[i-3];
13        }
14       return dp[n];
15    }
16}