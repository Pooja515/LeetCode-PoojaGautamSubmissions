// Last updated: 26/07/2026, 08:58:09
1class Solution {
2    int[][] memo;
3    public int coinChange(int[] coins, int amount) {
4        int n = coins.length;
5
6        memo = new int[n][amount + 1];
7        for(int[] rows : memo){
8            Arrays.fill(rows , -1);
9        }
10        int res = f(n - 1, amount, coins);
11        return res >= (int) 1e9 ? -1 : res;
12    }
13
14    int f(int ind, int amount, int[] coins) {
15        if (amount == 0) {
16            return 0;
17        }
18
19        if (ind == 0) {
20            if (amount % coins[0] == 0) {
21                return amount / coins[0];
22            } else
23                return (int) 1e9;
24        }
25        if(memo[ind][amount] != -1) return memo[ind][amount];
26        int notpick = 0 + f(ind - 1, amount, coins);
27        int pick = (int) 1e9;
28        if (coins[ind] <= amount) {
29            pick = 1 + f(ind, amount - coins[ind], coins);
30        }
31
32        return memo[ind][amount] =  Math.min(pick, notpick);
33    }
34}