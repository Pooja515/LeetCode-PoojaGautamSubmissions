// Last updated: 05/07/2026, 15:42:40
1class Solution {
2    public int maxProfit(int[] prices) {
3        int n = prices.length;
4        if(n == 0) return 0;
5  
6        int[][][] dp = new int[n + 1][2][3]; 
7
8for (int i = n - 1; i >= 0; i--) {
9    for (int buy = 0; buy <= 1; buy++) {
10        for (int cap = 1; cap <=2 ; cap++) { 
11            if (buy == 1) {
12                int take = -prices[i] + dp[i + 1][0][cap];
13                int nottake = 0 + dp[i + 1][1][cap];
14                dp[i][buy][cap] = Math.max(take, nottake);
15            } else {
16                int take = prices[i] + dp[i + 1][1][cap - 1]; 
17                int nottake = 0 + dp[i + 1][0][cap];
18                dp[i][buy][cap] = Math.max(take, nottake);
19            }
20        }
21    }
22}
23return dp[0][1][2];
24    }
25}