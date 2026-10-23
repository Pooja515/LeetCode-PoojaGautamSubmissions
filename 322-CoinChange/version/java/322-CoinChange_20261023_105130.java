// Last updated: 23/10/2026, 10:51:30
1class Solution {
2   
3    public int coinChange(int[] coins, int amount) {
4        int n = coins.length;
5        int[] dp = new int [amount+1];
6
7        for(int i=0;i<=amount;i++){
8          if (i % coins[0] ==0) {
9                dp[i] = i / coins[0];
10            } else
11                 dp[i] = (int) 1e9;
12        }
13       
14        for(int i=1;i<n;i++){
15             int[] cur = new int [amount+1];
16            for(int t=0;t<=amount;t++){
17                int take = (int) 1e9;
18                if (coins[i] <= t) {
19                   take = 1 + cur[t - coins[i]];
20                }
21                int nottake = 0 + dp[t];
22
23                cur[t] = Math.min(take, nottake);
24            }
25            dp=cur;
26        }
27
28        return dp[amount] >= (int) 1e9 ? -1:dp[amount];
29    }
30}