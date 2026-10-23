// Last updated: 23/10/2026, 10:17:11
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
11        if (amount == 0)
12            return 0;
13
14        return f(n - 1, amount, coins) >= (int) 1e9 ?-1: f(n - 1, amount, coins);
15    }
16
17    int f(int i, int amount, int[] coins) {
18
19        if (amount == 0)
20            return 0;
21
22    if (i == 0) {
23            if (amount % coins[0] ==0) {
24                return amount / coins[0];
25            } else
26                return (int) 1e9;
27        }
28
29        if(memo[i][amount] != -1) return memo[i][amount];
30
31        int take = (int) 1e9;
32        if (coins[i] <= amount) {
33            take = 1 + f(i, amount - coins[i], coins);
34        }
35        int nottake = 0 + f(i - 1, amount, coins);
36
37        return memo[i][amount] = Math.min(take, nottake);
38    }
39}