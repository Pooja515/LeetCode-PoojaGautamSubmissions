// Last updated: 06/07/2026, 16:24:41
1class Solution {
2    int[][][] memo;
3    public int maxProfit(int[] prices) {
4        int n = prices.length;
5
6        memo = new int[n][2][3];
7        for(int[][] row : memo){
8            for(int[] r: row){
9                Arrays.fill(r , -1);
10            }
11        }
12        return f(0, 1, 2, prices, n);
13    }
14
15    int f(int ind, int buy, int trans, int[] prices, int n) {
16        if (ind == n || trans == 0)
17            return 0;
18        if(memo[ind][buy][trans] != -1){
19            return memo[ind][buy][trans];
20        }
21        if (buy == 1) {
22            int buytoday = -prices[ind] + f(ind + 1, 0, trans, prices, n);
23            int skipbuy = 0 + f(ind + 1, 1, trans, prices, n);
24
25            return memo[ind][buy][trans] = Math.max(buytoday, skipbuy);
26
27        }
28
29        else {
30            int selltoday = prices[ind] + f(ind + 1, 1, trans - 1, prices, n);
31            int holdsell = 0 + f(ind + 1, 0, trans, prices, n);
32
33            return memo[ind][buy][trans]= Math.max(selltoday, holdsell);
34
35        }
36    }
37}