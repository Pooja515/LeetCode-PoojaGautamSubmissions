// Last updated: 23/10/2026, 10:46:41
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
16            // cur[0] =0;
17            for(int t=0;t<=amount;t++){
18                int take = (int) 1e9;
19                if (coins[i] <= t) {
20                   take = 1 + cur[t - coins[i]];
21                }
22                int nottake = 0 + dp[t];
23
24                cur[t] = Math.min(take, nottake);
25            }
26            dp=cur;
27        }
28
29        return dp[amount] >= (int) 1e9 ? -1:dp[amount];
30    }
31}