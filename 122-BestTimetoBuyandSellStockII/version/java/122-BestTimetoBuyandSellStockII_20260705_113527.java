// Last updated: 05/07/2026, 11:35:27
1class Solution {
2    
3    public int maxProfit(int[] prices) {
4        int n = prices.length;
5
6        int[] prev = new int [2];
7
8        prev[0] =0;
9        prev[1] =0;
10       
11        for(int i = n-1; i >= 0; i--){
12              int[] cur = new int [2];
13            for(int j = 0; j < 2;j++){
14                int  profit =0;
15                // buy
16                if(j==1){
17                 //take
18                int take = -prices[i] + prev[0];
19                //notTake
20                int notTake = 0 + prev[1] ;
21                profit = Math.max(take , notTake);
22           
23            }
24        //sell
25        else {
26                //take
27                int take = prices[i] +prev[1];
28                //nottake
29                int notTake = 0 + prev[0];
30
31                profit = Math.max(take , notTake);
32             
33            }
34
35          cur[j] = profit;
36
37            }
38            prev = cur;
39        }
40
41      return prev[1] ;
42    }
43}