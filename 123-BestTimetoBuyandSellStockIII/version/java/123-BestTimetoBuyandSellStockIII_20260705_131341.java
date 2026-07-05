// Last updated: 05/07/2026, 13:13:41
1class Solution {
2    public int maxProfit(int[] prices) {
3        int n = prices.length;
4// Size 4 for cap because cap can be 0, 1, 2, or 3
5int[][][] dp = new int[n + 1][2][4]; 
6
7for (int i = n - 1; i >= 0; i--) {
8    for (int buy = 0; buy < 2; buy++) {
9        // cap needs to go down to 1 because cap-1 is used below
10        for (int cap = 3; cap >= 1; cap--) { 
11            if (buy == 1) {
12                int take = -prices[i] + dp[i + 1][0][cap];
13                int nottake = 0 + dp[i + 1][1][cap];
14                dp[i][buy][cap] = Math.max(take, nottake);
15            } else {
16                int take = prices[i] + dp[i + 1][1][cap - 1]; // Fixed buy state to 1 after selling
17                int nottake = 0 + dp[i + 1][0][cap];
18                dp[i][buy][cap] = Math.max(take, nottake);
19            }
20        }
21    }
22}
23
24// The result will be stored here (starting at day 0, looking to buy, with 2 transactions left)
25return dp[0][1][2];
26    }
27}