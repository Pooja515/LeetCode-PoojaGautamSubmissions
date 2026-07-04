// Last updated: 04/07/2026, 08:49:47
1class Solution {
2    int[][] memo;
3    public int maxProfit(int[] prices) {
4        int n = prices.length;
5        memo = new int[n][2];
6        for(int[] row : memo){
7            Arrays.fill(row , -1);
8        }
9
10        return f(0 , 1, prices,n);
11
12    }
13    int  f(int ind ,int  buy , int[] prices , int n){
14        if(ind == n) return 0;
15        int  profit =0;
16        if(memo[ind][buy] != -1) return memo[ind][buy];
17        if(buy ==1){
18            //take
19            int take = -prices[ind] +f(ind+1 , 0, prices ,n);
20            int notTake = 0 + f(ind + 1 , 1 , prices , n);
21            profit = Math.max(take , notTake);
22           
23        }
24        else {
25              //take
26            int take = prices[ind] +f(ind+1 , 1 , prices , n);
27            int notTake = 0 + f(ind + 1 , 0 , prices , n);
28           profit = Math.max(take , notTake);
29           memo[ind][buy] = profit;
30        }
31        return   memo[ind][buy] = profit;
32    }
33}