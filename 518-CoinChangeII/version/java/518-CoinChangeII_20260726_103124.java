// Last updated: 26/07/2026, 10:31:24
1class Solution {
2    int[][] memo;
3    public int change(int amount, int[] coins) {
4     int  n = coins.length;
5     memo = new int[n][amount + 1];
6     for(int[] rows : memo){
7        Arrays.fill(rows, -1);
8     }
9     return f(n-1 , amount , coins);   
10    }
11    int f(int ind , int amount ,int[] coins){
12
13        if(amount == 0) return 1;
14        if(ind == 0){
15            if(coins[ind] <= amount){
16                return amount % coins[0] == 0 ? 1:0;
17            }
18            else
19                  return 0;
20        }
21        if(memo[ind][amount] != -1) return memo[ind][amount];
22        int notpick = f(ind-1 , amount , coins);
23        int pick = 0;
24        if(coins[ind] <= amount){
25            pick = f(ind , amount - coins[ind] , coins);
26
27        }
28        return memo[ind][amount] = pick + notpick;
29    }
30}