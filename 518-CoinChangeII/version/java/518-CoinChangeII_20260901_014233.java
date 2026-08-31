// Last updated: 01/09/2026, 01:42:33
1class Solution {
2    int[][] memo;
3    public int change(int amount, int[] coins) {
4        int n = coins.length;
5
6        memo = new int[n][amount + 1];
7        for(int[] rows : memo){
8            Arrays.fill(rows,-1);
9        }
10
11        return f(n-1,amount,coins);
12    }
13    int f(int i , int amount , int[] coins){
14
15        if(amount == 0) return 1;
16        if(i==0){
17            if(amount % coins[0] == 0) return 1;
18            else
19                  return 0;
20        }
21
22
23        if(memo[i][amount] != -1) return memo[i][amount];
24        // choices
25        int nottake = f(i-1,amount,coins);
26        int take = 0;
27        if(coins[i] <= amount){
28            take = f(i,amount-coins[i],coins);
29        }
30
31        return memo[i][amount] = take + nottake;
32    }
33}