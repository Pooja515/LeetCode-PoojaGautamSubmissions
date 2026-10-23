// Last updated: 23/10/2026, 10:28:10
1class Solution {
2   
3    public int coinChange(int[] coins, int amount) {
4        int n = coins.length;
5        int[][] dp = new int[n][amount+1];
6
7        for(int i=0;i<=amount;i++){
8          if (i % coins[0] ==0) {
9                dp[0][i] = i / coins[0];
10            } else
11                 dp[0][i] = (int) 1e9;
12        }
13       
14        for(int i=1;i<n;i++){
15            for(int t=0;t<=amount;t++){
16                int take = (int) 1e9;
17                if (coins[i] <= t) {
18                   take = 1 + dp[i][t - coins[i]];
19                }
20                int nottake = 0 + dp[i - 1][t];
21
22                dp[i][t] = Math.min(take, nottake);
23            }
24        }
25
26        return dp[n-1][amount] >= (int) 1e9 ? -1:dp[n-1][amount];
27    }
28}