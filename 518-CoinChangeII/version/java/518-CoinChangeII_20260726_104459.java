// Last updated: 26/07/2026, 10:44:59
1class Solution {
2    
3    public int change(int amount, int[] coins) {
4     int  n = coins.length;
5     int[][] dp = new int[n][amount + 1];
6
7     for(int target = 0 ;target <= amount ;target++){
8            if(target % coins[0] ==0){
9                  dp[0][target] = 1;
10            }
11            else
12                    dp[0][target] = 0;
13        }
14        
15     
16        for(int ind = 1 ;ind <n ;ind++){
17            for(int target =0 ; target <= amount ;target++){
18                int notpick = dp[ind-1][target];
19                int pick = 0;
20                if(coins[ind] <= target){
21                    pick = dp[ind][target - coins[ind]];
22
23                }
24                dp[ind][target] = pick + notpick;
25            }
26        }
27      
28      return dp[n-1][amount];
29      
30    }
31}