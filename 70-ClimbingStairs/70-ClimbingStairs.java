// Last updated: 28/06/2026, 01:04:55
class Solution {
    public int climbStairs(int n) {
      
       int prev2 = 1 , prev1 = 1;
       for(int i=2;i<=n;i++){
           int cur = prev2 + prev1;
           prev2 = prev1;
           prev1 = cur;
       }
       return prev1;
    }
}