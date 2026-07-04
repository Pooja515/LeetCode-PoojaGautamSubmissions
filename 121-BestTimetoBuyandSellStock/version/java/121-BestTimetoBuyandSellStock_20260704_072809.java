// Last updated: 04/07/2026, 07:28:09
1class Solution {
2    public int maxProfit(int[] prices) {
3        int buy = prices[0] , profit =0;
4        for(int i =1 ;i<prices.length ; i++){
5            buy = Math.min(buy , prices[i]);
6            profit = Math.max(profit , prices[i] - buy);
7        }
8        return profit;
9    }
10}