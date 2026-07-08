// Last updated: 08/07/2026, 18:24:45
1class Solution {
2    int[][][] memo;
3    public int maxProfit(int k, int[] prices) {
4        int n = prices.length;
5        memo = new int[n][2][k+1];
6        for(int[][] row : memo){
7            for(int r[] : row){
8                Arrays.fill(r , -1);
9            }
10        }
11
12        return f(0,1,k, prices,n);
13    }
14    int f(int ind ,int buy, int k , int[] prices, int n){
15        if(ind == n || k == 0 ) return 0;
16
17        if(memo[ind][buy][k] != -1){
18            return memo[ind][buy][k];
19        }
20
21        if(buy == 1){
22            int buyToday = -prices[ind] + f(ind+1 , 0 , k, prices , n);
23            int skipBuy = 0 + f(ind+1 , 1 , k , prices ,n);
24            return memo[ind][buy][k] =Math.max(buyToday,skipBuy);
25        }
26        else{
27             int sellToday = prices[ind] + f(ind+1 , 1 , k-1, prices , n);
28            int holdSell = 0 + f(ind+1 , 0 , k , prices ,n);
29            return memo[ind][buy][k] = Math.max(sellToday,holdSell);
30        }
31    }
32}