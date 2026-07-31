// Last updated: 31/07/2026, 09:53:02
1class Solution {
2  
3    public int change(int amount, int[] coins) {
4        int n = coins.length;
5        int[][] memo = new int[n][amount+1];
6        for(int[] rows : memo){
7            Arrays.fill(rows , -1);
8        }
9
10        return f(n-1,amount,coins,memo);
11    }
12    int f(int ind , int amount, int[] coins , int[][] memo){
13        if(amount == 0) return 1;
14        
15        if(ind == 0){
16        if(coins[0] <= amount){
17            if(amount % coins[0] == 0) return 1;
18            else
19                  return 0;
20        }
21        else 
22             return 0;
23        }
24        if(memo[ind][amount] != -1) return memo[ind][amount];
25
26        int notpick = f(ind-1, amount , coins , memo);
27        int pick = 0;
28        if(coins[ind] <= amount){
29            pick = f(ind,amount - coins[ind] ,coins,memo);
30        }
31
32        return memo[ind][amount] = pick + notpick;
33
34    }
35}