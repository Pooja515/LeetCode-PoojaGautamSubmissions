// Last updated: 26/09/2026, 14:54:18
1class Solution {
2    public int change(int amount, int[] coins) {
3        int n= coins.length;
4        int[][] dp = new int[n][amount+1];
5
6        for(int i=0;i<n;i++){
7            dp[i][0] =1;
8            }
9        for(int t=0;t <= amount;t++){
10            if(t % coins[0] == 0){
11                dp[0][t] =1;
12            }
13            else{
14                dp[0][t] =0;
15            }
16        }
17      
18       for(int i=1;i<n;i++){
19        for(int t=1;t<=amount;t++){
20
21              int nottake = dp[i-1][t];
22              int take = 0;
23              if(coins[i] <= t){
24                  take = dp[i][t-coins[i]];
25              }
26
27              dp[i][t] = take + nottake;
28        }
29       }
30
31      return dp[n-1][amount];
32    }
33}