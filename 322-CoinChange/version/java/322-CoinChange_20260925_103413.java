// Last updated: 25/09/2026, 10:34:13
1class Solution {
2    int[][] memo;
3    public int coinChange(int[] coins, int amount) {
4        int n = coins.length;
5        memo = new int[n][amount+1];
6
7        for(int[] rows:memo){
8            Arrays.fill(rows,-1);
9        }
10
11        int res = f(n-1,amount,coins);
12
13        return  res >= (int) 1e9 ? -1:res;
14    }
15
16    int f(int i,int target,int[] coins){
17
18        if(target == 0) return 0;
19        if(i==0) {
20            if(target % coins[0] == 0) 
21                 return target/coins[0];
22            else
23                 return (int) 1e9;
24        }
25        if(memo[i][target] != -1) return memo[i][target];
26        //nottake 
27        int nottake = 0 + f(i-1,target,coins);
28        int take = (int) 1e9;
29        if(coins[i] <= target){
30            take = 1 + f(i,target-coins[i],coins);
31        }
32
33        return memo[i][target] = Math.min(take,nottake);
34    }
35
36
37}