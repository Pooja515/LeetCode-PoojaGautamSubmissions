// Last updated: 28/06/2026, 01:03:23
class Solution {
    public int numSquares(int n) {
        int[] dp=new int[n+1];
        Arrays.fill(dp,n+1);
        dp[0]=0;
        for(int i=1;i<=n;i++){
            for(int s=1;s*s<=i;s++){
                dp[i]=Math.min(dp[i],1+dp[i-s*s]);
            }
        }
        return dp[n];
    }
}