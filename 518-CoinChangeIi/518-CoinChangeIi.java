// Last updated: 28/06/2026, 01:03:02
class Solution {
    
    public int change(int amount, int[] coins) {
        int n = coins.length;
        int[] dp = new int [amount + 1];
        dp[0] = 1;
        for(int t=1; t <= amount ; t++){
       
            if(t % coins[0] == 0){
                dp[t]= 1;
            }
            else
                 dp[t] = 0;
        }
        for(int i=1 ;i<n;i++){
             int[] cur = new int [amount + 1];
             cur[0] =1;
            for(int t=1; t<=amount ; t++){
                 int notpick = dp[t];
                 int pick = 0;
                 if(coins[i] <= t ){
                     pick = cur[t - coins[i]];
                  }
                  cur[t] = pick + notpick;
            }
            dp=cur;
        }
      
       

        return dp[amount];
    }
}