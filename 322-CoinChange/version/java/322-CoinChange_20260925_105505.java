// Last updated: 25/09/2026, 10:55:05
1class Solution {
2
3    public int coinChange(int[] coins, int amount) {
4        int n = coins.length;
5        int[][] dp = new int[n][amount + 1];
6//i==0,check divisibility for every target t
7    
8    for(int t=0 ;t<=amount;t++){
9        if (t % coins[0] == 0) {
10            dp[0][t] = t/coins[0];
11        } else
12            dp[0][t] = (int) 1e9;
13
14
15    }
16        for (int i = 1; i < n; i++) {
17            for (int t = 1; t <= amount; t++) {
18                int nottake = 0 + dp[i - 1][t];
19                int take = (int) 1e9;
20                if (coins[i] <= t) {
21                    take = 1 + dp[i][t - coins[i]];
22                }
23
24                dp[i][t] = Math.min(take, nottake);
25            }
26        }
27        int res = dp[n - 1][amount];
28        return res >= (int) 1e9 ? -1 : res;
29
30    }
31
32}