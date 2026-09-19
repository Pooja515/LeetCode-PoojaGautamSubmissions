// Last updated: 19/09/2026, 08:09:33
1class Solution {
2    int[] memo;
3    public int climbStairs(int n) {
4        if(n <= 2) return n;
5        memo= new int[n+1];
6
7        Arrays.fill(memo,-1);
8
9        return f(n);
10    }
11    int f(int i){
12        if(i<=2) return i;
13
14        if(memo[i] != -1) return memo[i];
15
16        int climb1 = f(i-1);
17        int climb2 = f(i-2);
18        return memo[i] = climb1 + climb2;
19    }
20}