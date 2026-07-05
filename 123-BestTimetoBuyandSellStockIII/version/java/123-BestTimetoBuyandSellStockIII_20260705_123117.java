// Last updated: 05/07/2026, 12:31:17
1class Solution {
2    int[][][] memo;
3    public int maxProfit(int[] prices) {
4
5        int n = prices.length;
6        memo = new int[n][2][3];
7        for(int[][] mat : memo){
8            for(int[] r: mat){
9                  Arrays.fill(r , -1);
10            }
11        }
12        return f(0,1,2,prices,n);
13    }
14    int f(int ind , int buy , int cap , int[] prices , int n){
15        
16        if(ind == n || cap == 0) return 0;
17
18        int profit = 0;
19
20        if(memo[ind][buy][cap] != -1) return memo[ind][buy][cap];
21
22        if(buy == 1){
23
24           int take = -prices[ind] + f(ind+1 , 0 , cap,prices ,n);
25           int nottake = 0 + f(ind+1 , 1 ,cap , prices , n);
26           profit = Math.max(take , nottake);
27           memo[ind][buy][cap] = profit;
28
29        }
30        else{
31             int take = prices[ind] + f(ind+1 , 1 , cap - 1,prices ,n);
32             int nottake = 0 + f(ind+1 , 0 ,cap , prices , n);
33             profit = Math.max(take , nottake);
34             memo[ind][buy][cap] = profit;
35        }
36        return memo[ind][buy][cap];
37    }
38}