// Last updated: 29/09/2026, 15:58:42
1class Solution {
2    int[][][] memo;
3    public int maxProfit(int k, int[] prices) {
4        int n=prices.length;
5        memo =new int[n][2][k+1];
6        for(int[][] rows:memo){
7            for(int[] r:rows){
8                Arrays.fill(r,-1);
9            }
10        }
11
12       return f(0,1,k,prices); 
13    }
14
15    int f(int i , int buy,int k,int[] prices){
16        if(i== prices.length || k==0) return 0;
17
18        if(memo[i][buy][k] != -1) return memo[i][buy][k];
19
20        if(buy == 1){
21            int buytoday= -prices[i] +f(i+1,0,k,prices);
22            int skiptoday= 0 +f(i+1,1,k,prices);
23            return memo[i][buy][k]=Math.max(buytoday,skiptoday);
24        }
25        else{
26             int selltoday= prices[i] +f(i+1,1,k-1,prices);
27            int skipsell= 0 +f(i+1,0,k,prices);
28            return memo[i][buy][k]=Math.max(selltoday,skipsell);
29        }
30    }
31}