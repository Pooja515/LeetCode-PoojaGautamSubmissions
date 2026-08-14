// Last updated: 15/08/2026, 04:47:12
1class Solution {
2    int[][] memo;
3    public int change(int amount, int[] coins) {
4        int n = coins.length;
5
6        memo= new int[n][amount+1];
7        for(int[] rows: memo){
8            Arrays.fill(rows,-1);
9        }
10
11        return f(0, amount, coins);
12    }
13
14    int f(int i, int amount, int[] coins) {
15
16        if (amount == 0)
17            return 1;
18
19        if (i == coins.length)
20            return 0;
21        
22        if(memo[i][amount] != -1) return memo[i][amount];
23
24        int nottake = f(i + 1, amount, coins);
25
26        int take = 0;
27
28        if (coins[i] <= amount) {
29            take = f(i, amount - coins[i], coins);
30        }
31
32        return memo[i][amount] = take + nottake;
33    }
34}