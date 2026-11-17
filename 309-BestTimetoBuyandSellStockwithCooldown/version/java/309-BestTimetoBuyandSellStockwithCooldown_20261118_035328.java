// Last updated: 18/11/2026, 03:53:28
1class Solution {
2    int[][] memo;
3    public int maxProfit(int[] prices) {
4        int n = prices.length;
5        memo = new int[n][2];
6        for(int[] rows:memo){
7            Arrays.fill(rows,-1);
8        }
9       
10       return f(0,1,prices);
11    }
12
13    int f(int ind , int buy ,int[] prices){
14        if(ind >= prices.length) return 0;
15
16        if(memo[ind][buy] != -1) return memo[ind][buy];
17
18        if(buy == 1){
19            int buytoday = -prices[ind] + f(ind+1,0,prices);
20            int skipbuy =  f(ind+1 , 1,prices);
21            return memo[ind][buy] = Math.max(buytoday , skipbuy);
22        }
23        else{
24            int selltoday = prices[ind] + f(ind+2,1,prices);
25            int skipsell = f(ind+1,0,prices);
26            return memo[ind][buy] = Math.max( selltoday ,skipsell );
27        }
28    }
29}