// Last updated: 13/08/2026, 02:57:03
1class Solution {
2   
3    public int maxProfit(int[] prices, int fee) {
4        int n = prices.length;
5         int[] cur = new int[2];
6         cur[0] =0;
7         cur[1] =0;
8       
9         for(int i=n-1;i>=0;i--){
10          
11            cur[0]= Math.max(prices[i] + cur[1] - fee ,cur[0]);
12            cur[1]= Math.max(-prices[i] + cur[0] ,cur[1]);
13    
14         }
15        return cur[1];
16    }
17}