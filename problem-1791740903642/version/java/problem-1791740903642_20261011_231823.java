// Last updated: 11/10/2026, 23:18:23
1class Solution {
2    public int maxProfit(int[] prices) {
3        int buy = prices[0],n = prices.length , maxi = 0;
4
5         for(int i=1;i<n;i++){
6            buy= Math.min(buy,prices[i]);
7            int profit = prices[i]-buy;
8
9            maxi= Math.max(maxi,profit);
10         }
11         return maxi;
12    }
13}