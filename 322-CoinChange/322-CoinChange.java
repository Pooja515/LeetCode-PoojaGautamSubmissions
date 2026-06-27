// Last updated: 28/06/2026, 01:03:20
class Solution {
    
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
  
        int[] dp = new int [amount + 1];

        for(int target = 0 ;target <= amount ; target++){
            if(target % coins[0] == 0){
                dp[target] = target / coins[0];
            }
            else {
                dp[target] = (int) 1e9;
            }
        }
        
     for(int ind=1; ind<n ; ind++){
          int[] cur = new int [amount + 1];
        for(int target =0; target <= amount ; target++){
             int nottake = 0 + dp[target];
             int take = (int) 1e9;
             if(coins[ind] <= target){
                  take = 1 + cur[target - coins[ind]] ;
                }

             cur[target] = Math.min(nottake , take );
    
        }
        dp = cur;
     }

 return dp[amount] >= (int) 1e9 ? -1 : dp[amount];

    }
}