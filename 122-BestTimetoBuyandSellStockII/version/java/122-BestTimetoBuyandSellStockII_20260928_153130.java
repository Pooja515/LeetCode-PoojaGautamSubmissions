// Last updated: 28/09/2026, 15:31:30
1class Solution {
2    int[][] memo ;
3    public int maxProfit(int[] prices) {
4        int n = prices.length;
5        memo = new int[n][2];
6        for(int[] rows:memo){
7            Arrays.fill(rows,-1);
8        }
9        return f(0,1,prices);
10    }
11    int f(int i, int buy,int[] prices){
12        if(i == prices.length) return 0;
13
14        if(memo[i][buy] != -1) return memo[i][buy];
15
16        if(buy==1){
17            int buytoday = -prices[i]+f(i+1,0,prices);
18            int notbuy= 0+  f(i+1,1,prices);
19            return memo[i][buy]=Math.max(buytoday,notbuy);
20        }
21       else{
22            int selltoday = prices[i]+f(i+1,1,prices);
23            int notsell= 0+  f(i+1,0,prices);
24            return memo[i][buy]=Math.max(selltoday,notsell);
25       }
26    }
27}