// Last updated: 13/08/2026, 02:45:45
1class Solution {
2    int[][] memo;
3    public int maxProfit(int[] prices, int fee) {
4        int n = prices.length;
5        memo = new int[n][2];
6        for(int[] rows : memo){
7            Arrays.fill(rows,-1);
8        }
9
10        return f(0,1,fee,prices);
11    }
12
13    int f(int i , int buy , int fee,int[] prices){
14        if( i == prices.length) return 0;
15
16        if(memo[i][buy] != -1) return memo[i][buy];
17
18        if(buy == 1){
19            int buytoday = -prices[i] + f(i+1,0,fee,prices);
20            int skipbuy = 0 + f(i+1,1,fee,prices);
21
22            return memo[i][buy] = Math.max(buytoday, skipbuy);
23        }
24        else{
25            int selltoday = prices[i] + f(i+1,1,fee,prices) - fee;
26            int skipsell = 0 + f(i+1,0,fee,prices);
27            return memo[i][buy]=Math.max(selltoday,skipsell);
28        }
29    }
30}