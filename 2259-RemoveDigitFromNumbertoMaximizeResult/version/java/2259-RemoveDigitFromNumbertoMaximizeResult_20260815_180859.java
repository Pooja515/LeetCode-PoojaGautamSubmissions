// Last updated: 15/08/2026, 18:08:59
1class Solution {
2    int[][] memo;
3    public int coinChange(int[] coins, int amount) {
4        int n= coins.length;
5        memo= new int[n][amount+1];
6
7        for(int[] rows:memo){
8            Arrays.fill(rows,-1);
9        }
10
11        if(amount == 0) return 0;
12        if(n==1){
13            if(amount % coins[0] == 0){
14                return amount/coins[0];
15            }
16            else
17                 return -1;
18        }
19        
20        return f(0,amount ,coins) >= (int) 1e9 ?-1:f(0,amount ,coins);
21    }
22    int f(int ind ,int amount , int[] coins){
23
24        //base case 
25        if(amount == 0) return 0;
26
27        if(ind == coins.length) return (int) 1e9;
28
29        if(memo[ind][amount] != -1) return memo[ind][amount];
30
31        //nottake
32        int nottake = 0 + f(ind+1,amount,coins);
33        int take = (int) 1e9;
34        if(coins[ind] <= amount){
35            take = 1 + f(ind,amount - coins[ind] , coins);
36        }
37
38        return memo[ind][amount] = Math.min(take,nottake);
39    }
40}