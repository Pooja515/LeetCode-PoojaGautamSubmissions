// Last updated: 26/07/2026, 09:31:08
1class Solution {
2  
3    public int coinChange(int[] coins, int amount) {
4        int n = coins.length;
5
6        int[][] dp = new int[n][amount + 1];
7        
8        for(int target = 0 ;target <=amount ;target++){
9            if(target % coins[0] == 0){
10                 dp[0][target] = target/coins[0];
11            }
12            else
13                 dp[0][target] = (int) 1e9;
14           
15        }
16
17        for(int ind = 1;ind < n ;ind++){
18            for(int target = 0 ; target <= amount ;target++){
19            int notpick = 0 + dp[ind - 1][target];
20            int pick = (int) 1e9;
21            if (coins[ind] <= target) {
22                pick = 1 + dp[ind][target - coins[ind]];
23            }
24
25            dp[ind][target] =  Math.min(pick, notpick);
26            }
27        }
28        return dp[n-1][amount] >= (int) 1e9 ?-1 : dp[n-1][amount];
29    }
30}