// Last updated: 08/08/2026, 16:54:00
1class Solution {
2
3    public int numDistinct(String s, String t) {
4        int m = s.length() , n= t.length();
5        if(m <n) return 0;
6
7        int[][] dp= new int[m+1][n+1];
8
9        for(int ind1 =0 ;ind1 <= m;ind1++){
10            dp[ind1][0] = 1;
11        }
12
13        for(int ind1=1;ind1 <= m; ind1++){
14            for(int ind2 = 1 ; ind2 <= n ; ind2++){
15
16               if(s.charAt(ind1-1) == t.charAt(ind2-1)){
17                    dp[ind1][ind2]= dp[ind1-1][ind2-1] + dp[ind1-1][ind2];
18               }
19                else{
20                      dp[ind1][ind2]=dp[ind1-1][ind2];
21               }
22            }
23        }
24    return dp[m][n];
25    }
26}