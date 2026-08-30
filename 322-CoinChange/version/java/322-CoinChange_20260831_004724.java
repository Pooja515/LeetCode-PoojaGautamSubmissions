// Last updated: 31/08/2026, 00:47:24
1class Solution {
2    int[][] memo;
3    public int coinChange(int[] coins, int amount) {
4        int n = coins.length;
5        memo = new int[n][amount +1];
6        for(int[] rows : memo){
7            Arrays.fill(rows,-1);
8        }
9
10        int res =f(n - 1, amount, coins);
11
12        return res >= (int) 1e9?-1:res;
13    }
14
15    int f(int i , int amount , int[] coins){
16        if(amount == 0) return 0;
17        if (i == 0) {
18            if (amount % coins[0] == 0) {
19                return amount / coins[0];
20            } else
21                return (int) 1e9;
22        }
23        if(memo[i][amount] != -1) return memo[i][amount];
24        int nottake = 0 + f(i-1,amount,coins);
25        int take =(int) 1e9;
26        if(coins[i] <= amount ){
27            take = 1 + f(i,amount-coins[i] ,coins);                                 
28        }
29        return memo[i][amount]= Math.min(take,nottake);
30    }
31}