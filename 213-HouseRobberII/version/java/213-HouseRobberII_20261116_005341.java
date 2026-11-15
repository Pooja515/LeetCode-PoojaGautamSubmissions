// Last updated: 16/11/2026, 00:53:41
1class Solution {
2
3    public int rob(int[] nums) {
4
5        int n = nums.length;
6
7        if (n == 1)
8            return nums[0];
9
10        int excludeLast = f(0,n-2 ,nums );
11
12        int excludeFirst = f(1,n-1 ,  nums);
13
14        return Math.max(excludeLast, excludeFirst);
15    }
16
17    int f(int start,int end , int[] nums) {
18        int m= end - start +1;
19        if( m==1) return nums[start];
20
21        int[] dp = new int[m];
22        dp[0] = nums[start];
23        dp[1] = Math.max(nums[start] , nums[start + 1]);
24
25        for(int i=2 ;i<m;i++){
26            int pick = nums[start + i] + dp[i - 2];
27            int notPick = dp[i - 1];
28
29            dp[i] = Math.max(pick, notPick);
30
31        }
32      return dp[m-1];
33    }
34}