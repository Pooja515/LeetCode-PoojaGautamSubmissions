// Last updated: 05/07/2026, 21:04:25
1class Solution {
2    int[][] memo ;
3    public int maxProfit(int[] prices) {
4       int n = prices.length;
5       memo = new int[n][2];
6       for(int[] r:memo){
7        Arrays.fill(r , -1);
8       }
9
10       return f(0,1,prices,n); 
11    }
12    int f(int ind , int buy , int[] prices , int n){
13        if(ind == n) return 0;
14        if(memo[ind][buy] != -1) return memo[ind][buy];
15        //buy
16        if(buy == 1){
17            int take = -prices[ind] + f(ind + 1 , 0 , prices , n);
18            int nottake = 0 + f(ind + 1 , 1, prices , n);
19            int profit = Math.max(take , nottake);
20            return memo[ind][buy]=profit;
21        }
22        //sell
23        else{
24            int take = prices[ind] + f(ind + 1 , 1 , prices , n);
25            int nottake = 0 + f(ind + 1 , 0, prices , n);
26            int profit = Math.max(take , nottake);
27            return memo[ind][buy]= profit;
28        }
29        
30    }
31}