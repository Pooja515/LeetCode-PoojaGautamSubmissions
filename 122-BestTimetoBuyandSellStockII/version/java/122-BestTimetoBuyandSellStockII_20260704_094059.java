// Last updated: 04/07/2026, 09:40:59
1class Solution {
2    
3    public int maxProfit(int[] prices) {
4        int n = prices.length;
5
6        int[][] dp = new int[n+1][2];
7
8        dp[n][0] =0;
9        dp[n][1] =0;
10       
11        for(int i = n-1; i >= 0; i--){
12            for(int j = 0; j < 2;j++){
13                int  profit =0;
14                // buy
15                if(j==1){
16                 //take
17                int take = -prices[i] + dp[i+1][0];
18                //notTake
19                int notTake = 0 + dp[i + 1][1] ;
20                profit = Math.max(take , notTake);
21           
22            }
23        //sell
24        else {
25                //take
26                int take = prices[i] +dp[i + 1][1];
27                //nottake
28                int notTake = 0 + dp[i + 1][0];
29
30                profit = Math.max(take , notTake);
31             
32            }
33
34          dp[i][j] = profit;
35
36            }
37        }
38
39      return dp[0][1] ;
40    }
41}