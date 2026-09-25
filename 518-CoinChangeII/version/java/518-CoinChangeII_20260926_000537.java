// Last updated: 26/09/2026, 00:05:37
1class Solution {
2    int[][] memo;
3    public int change(int amount, int[] coins) {
4        int n= coins.length;
5
6        memo = new int[n][amount+1];
7        for(int[] rows:memo){
8            Arrays.fill(rows,-1);
9        }
10
11        return f(n-1,amount,coins);
12    }
13
14    int f(int i,int target,int[] coins){
15        if(target == 0) return 1;
16        if(i<0) return 0;
17
18        if(memo[i][target] != -1) return memo[i][target];
19
20        int nottake = f(i-1,target,coins);
21        int take = 0;
22        if(coins[i] <= target){
23            take = f(i,target-coins[i],coins);
24        }
25
26        return memo[i][target] = take + nottake;
27    }
28}