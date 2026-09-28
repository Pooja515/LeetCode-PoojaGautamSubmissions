// Last updated: 28/09/2026, 21:44:13
1class Solution {
2    int[][] memo;
3    public int maxProfit(int[] prices) {
4        int n = prices.length;
5        memo = new int[n][2];
6        for(int[] rows:memo){
7            Arrays.fill(rows,-1);
8        }
9        return f(0,1,prices);
10    }
11
12    int f(int i,int buy,int[] prices){
13        if(i == prices.length) return 0;
14
15        if(memo[i][buy] != -1) return memo[i][buy];
16
17        if(buy == 1){
18            int buytoday = -prices[i] + f(i+1,0,prices);
19            int skiptoday = 0 + f(i+1,1,prices);
20            return  memo[i][buy]=Math.max(buytoday , skiptoday);
21        }
22        else{
23             int selltoday = prices[i] + f(i+1,1,prices);
24            int skiptoday = 0 + f(i+1,0,prices);
25            return  memo[i][buy]=Math.max(selltoday , skiptoday);
26        }
27    }
28}