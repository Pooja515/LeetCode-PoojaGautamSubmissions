// Last updated: 26/07/2026, 10:43:07
1class Solution {
2    
3    public int change(int amount, int[] coins) {
4        int n = coins.length;
5        int[] dp = new int [amount + 1];
6        dp[0] = 1;
7        for(int t=1; t <= amount ; t++){
8       
9            if(t % coins[0] == 0){
10                dp[t]= 1;
11            }
12            else
13                 dp[t] = 0;
14        }
15        for(int i=1 ;i<n;i++){
16             int[] cur = new int [amount + 1];
17             cur[0] =1;
18            for(int t=1; t<=amount ; t++){
19                 int notpick = dp[t];
20                 int pick = 0;
21                 if(coins[i] <= t ){
22                     pick = cur[t - coins[i]];
23                  }
24                  cur[t] = pick + notpick;
25            }
26            dp=cur;
27        }
28      
29       
30
31        return dp[amount];
32    }
33}