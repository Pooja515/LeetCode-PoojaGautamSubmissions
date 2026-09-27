// Last updated: 27/09/2026, 18:29:59
1class Solution {
2    public int maxProfit(int[] prices) {
3      int buy = Integer.MAX_VALUE , maxi = Integer.MIN_VALUE;
4      for(int i=0;i<prices.length;i++){
5        buy = Math.min(buy,prices[i]);
6        int profit = prices[i]-buy;
7        maxi= Math.max(maxi,profit);
8      } 
9
10      return maxi; 
11    }
12}