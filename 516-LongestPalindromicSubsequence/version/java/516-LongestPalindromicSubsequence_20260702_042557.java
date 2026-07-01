// Last updated: 02/07/2026, 04:25:57
1class Solution {
2    
3    public int longestPalindromeSubseq(String s) {
4        int n = s.length();
5        int[][] dp = new int[n+1][n+1];
6        String s1 = reverse(s , 0 , n-1);
7        
8        for(int i =0 ;i<=n;i++){
9            for(int j =0;j<=n;j++){
10              // base case
11               if(i==0 || j==0) dp[i][j] = 0;
12
13               
14               else{
15                     if(s.charAt(i-1) == s1.charAt(j-1)){
16                          dp[i][j] = 1 + dp[i-1][j-1];
17                        }
18                            
19                       
20                    else{
21                           dp[i][j] = 0 + Math.max(dp[i-1][j] , dp[i][j-1]);
22                        }
23                    } 
24            }
25        }
26       return dp[n][n];
27    }
28
29     String reverse (String s , int l, int r){
30       char[] a = s.toCharArray();
31            
32        while (l<r){
33            char temp = a[l];
34            a[l] = a[r];
35            a[r] = temp;
36            l++;
37            r--;
38        }
39        return new String(a);
40    }
41}