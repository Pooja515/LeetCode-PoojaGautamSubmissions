// Last updated: 02/07/2026, 08:27:21
1class Solution {
2    public int minInsertions(String s) {
3          int n = s.length();
4
5          return n - longestPalindromeSubseq(s); 
6    }
7    public int longestPalindromeSubseq(String s) {
8        int n = s.length();
9        int[][] dp = new int[n+1][n+1];
10        String s1 = reverse(s , 0 , n-1);
11        
12        for(int i =0 ;i<=n;i++){
13            for(int j =0;j<=n;j++){
14              // base case
15               if(i==0 || j==0) dp[i][j] = 0;
16
17               
18               else{
19                     if(s.charAt(i-1) == s1.charAt(j-1)){
20                          dp[i][j] = 1 + dp[i-1][j-1];
21                        }
22                            
23                       
24                    else{
25                           dp[i][j] = 0 + Math.max(dp[i-1][j] , dp[i][j-1]);
26                        }
27                    } 
28            }
29        }
30       return dp[n][n];
31    }
32
33     String reverse (String s , int l, int r){
34       char[] a = s.toCharArray();
35            
36        while (l<r){
37            char temp = a[l];
38            a[l] = a[r];
39            a[r] = temp;
40            l++;
41            r--;
42        }
43        return new String(a);
44    }
45}