// Last updated: 15/11/2026, 08:47:29
1class Solution {
2    int[][] memo;
3    public int coinChange(int[] coins, int amount) {
4       int n = coins.length;
5       memo = new int[n][amount+1];
6       for(int[] rows: memo){
7           Arrays.fill(rows,-1);
8       }
9
10       return f(n-1,amount,coins) >= (int) 1e9 ? -1:f(n-1,amount,coins);
11    }
12    int f(int i , int amount ,int[] coins){
13        if(i==0){
14            if(amount % coins[i] == 0){
15                return amount/coins[i];
16            }
17            else{
18                return (int) 1e9;
19            }
20        }
21
22        if(memo[i][amount] != -1){
23            return memo[i][amount];
24        }
25
26        int nottake = f(i-1,amount ,coins);
27        int take = (int) 1e9;
28        if(coins[i] <= amount){
29            take = 1 + f(i,amount - coins[i],coins);
30        }
31
32        return memo[i][amount] = Math.min(take,nottake);
33    }
34}