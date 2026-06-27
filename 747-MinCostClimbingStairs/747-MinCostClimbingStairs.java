// Last updated: 28/06/2026, 01:02:40
class Solution {
   
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
       
        int prev2 = 0 , prev1 = 0;
        for(int i=2 ;i<=n;i++){
                int climb1 = cost[i-1] + prev1;
                int climb2 = climb2 = cost[i-2] + prev2;

                int cur= Math.min(climb1,climb2);
                prev2 = prev1;
                prev1 = cur;
        }
       return prev1;
    }
}