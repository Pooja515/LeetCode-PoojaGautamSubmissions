// Last updated: 03/07/2026, 15:01:57
1class Solution {
2  
3    public int longestPalindromeSubseq(String s) {
4        int n = s.length();
5
6        String s2 = reverse(s, 0 , n-1);
7        
8        int m = s2.length();
9
10        int[][] dp = new int[n+1][m+1];
11
12        for(int i = 0;i<=n;i++){
13            for(int j=0;j<=m;j++){
14
15                 if(i == 0 || j == 0){
16                    dp[i][j] =0;
17                 }
18
19                 else{
20                       if(s.charAt(i-1) == s2.charAt(j-1)){
21                              dp[i][j] = 1 + dp[i-1][j-1];
22                        }
23                        else{
24                             dp[i][j] = 0 + Math.max(dp[i-1][j] , dp[i][j-1] );
25                          } 
26                    }
27                    
28                }
29            }
30      return dp[n][m];
31    }
32    String reverse(String s , int l , int r){
33        char[] a = s.toCharArray();
34        while(l<r){
35        char temp = a[l];
36        a[l] = a[r];
37        a[r] = temp;
38        l++;
39        r--;
40       }
41       return new String(a);
42    }
43}