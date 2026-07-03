// Last updated: 03/07/2026, 16:58:41
1class Solution {
2    int [][] memo;
3    public int change(int amount, int[] coins) {
4        int n = coins.length;
5        memo = new int[n][amount +1];
6        for(int[] r: memo){
7            Arrays.fill(r,-1);
8        }
9        return f(n-1 , amount ,coins);
10    }
11
12    int f(int i , int amount , int[] coins){
13        if(amount == 0){
14           return 1;
15        }
16        if(i == 0){
17            if(amount % coins[0] == 0){
18                return 1;
19            }
20            else
21                  return 0;
22        }
23        if(memo[i][amount] != -1) return memo[i][amount];
24
25        int notpick = f(i-1 , amount , coins);
26        int pick = 0;
27        if(coins[i] <= amount ){
28            pick = f(i,amount - coins[i], coins);
29        }
30
31        memo[i][amount] = pick + notpick;
32        return memo[i][amount];
33    }
34}