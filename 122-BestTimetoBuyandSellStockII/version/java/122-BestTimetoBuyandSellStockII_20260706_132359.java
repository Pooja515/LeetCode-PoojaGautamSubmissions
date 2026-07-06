// Last updated: 06/07/2026, 13:23:59
1class Solution {
2    int[][] memo;
3
4    public int maxProfit(int[] prices) {
5        int n = prices.length;
6
7        memo = new int[n][2];
8        for (int[] row : memo) {
9            Arrays.fill(row, -1);
10        }
11        return f(0, 1, prices, n);
12    }
13
14    int f(int ind, int buy, int[] prices, int n) {
15        //BASE CASE 
16        if (ind == n)
17            return 0;
18
19        if (memo[ind][buy] != -1)
20            return memo[ind][buy];
21
22        if (buy == 1) {
23            int buytoday = -prices[ind] + f(ind + 1, 0, prices, n);
24            int notBuytoday = 0 + f(ind + 1, 1, prices, n);
25            return memo[ind][buy] = Math.max(buytoday, notBuytoday);
26
27        } else {
28            int selltoday = prices[ind] + f(ind + 1, 1, prices, n);
29            int notSelltoday = 0 + f(ind + 1, 0, prices, n);
30            return memo[ind][buy] = Math.max(selltoday, notSelltoday);
31        }
32    }
33}