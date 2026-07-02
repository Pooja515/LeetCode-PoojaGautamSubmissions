// Last updated: 02/07/2026, 10:47:11
1class Solution {
2   
3    public int numDistinct(String s, String t) {
4        int n = s.length() , m = t.length();
5        
6         int[][] dp  = new int[n+1][m+1];
7
8         for (int i = 0; i <= n; i++) {
9            dp[i][0] = 1;
10        }
11        
12         for(int i = 1 ;i<= n ;i++){
13            for(int j =1 ; j<=m ; j++){
14              
15                    if(s.charAt(i-1) == t.charAt(j-1)){
16                        dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
17                    }
18                    else{
19                        dp[i][j] =dp[i-1][j];
20                    }
21                }
22            }
23         
24       
25        return dp[n][m] ;
26    }
27}