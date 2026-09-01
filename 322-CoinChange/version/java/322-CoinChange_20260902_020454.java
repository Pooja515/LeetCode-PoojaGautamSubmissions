// Last updated: 02/09/2026, 02:04:54
1class Solution {
2    int[][] memo;
3    public int coinChange(int[] coins, int amount) {
4        int n = coins.length;
5        memo=new int[n][amount+1];
6        for(int[] rows: memo){
7            Arrays.fill(rows,-1);
8        }
9
10        int res = f(n - 1, amount, coins);
11
12        return res >= (int) 1e9 ? -1 : res;
13    }
14
15    int f(int i, int target, int[] coins) {
16
17        if (target == 0)
18            return 0;
19        if (i == 0) {
20
21            if (target % coins[0] == 0) {
22                return target / coins[0];
23            }
24
25            else
26                return (int) 1e9;
27
28        }
29
30        if(memo[i][target] != -1) return memo[i][target];
31
32        int nottake = f(i - 1, target, coins);
33        int take = (int) 1e9;
34        if (coins[i] <= target) {
35            take = 1 + f(i, target - coins[i], coins);
36        }
37
38        return memo[i][target] = Math.min(take, nottake);
39    }
40}