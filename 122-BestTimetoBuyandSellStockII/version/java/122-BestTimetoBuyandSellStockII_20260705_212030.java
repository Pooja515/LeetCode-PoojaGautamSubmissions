// Last updated: 05/07/2026, 21:20:30
1class Solution {
2  
3    public int maxProfit(int[] prices) {
4       int n = prices.length;
5        int[]dp = new int[2];
6        int[]cur = new int[2];
7        cur[0] =0;
8        cur[1] =0;
9     
10        for(int ind = n-1 ;ind>=0 ;ind--){
11             cur[0]= Math.max(prices[ind] + dp[1], 0 + dp[0]);
12                   
13            cur[1]= Math.max(-prices[ind] + dp[0] ,0 + dp[1]);
14            dp = cur;
15        }
16
17    return dp[1];
18    }
19}