// Last updated: 03/07/2026, 15:04:00
1class Solution {
2  
3    public int longestPalindromeSubseq(String s) {
4        int n = s.length();
5
6        String s2 = reverse(s, 0 , n-1);
7        
8        int m = s2.length();
9
10        int[] dp = new int[m+1];
11
12        for(int i = 0;i<=n;i++){
13              int[] cur = new int[m+1];
14            for(int j=0;j<=m;j++){
15
16                 if(i == 0 || j == 0){
17                    cur[j] =0;
18                 }
19
20                 else{
21                       if(s.charAt(i-1) == s2.charAt(j-1)){
22                              cur[j] = 1 + dp[j-1];
23                        }
24                        else{
25                             cur[j] = 0 + Math.max(dp[j] , cur[j-1] );
26                          } 
27                    }
28                    
29                }
30                dp = cur;
31            }
32      return dp[m];
33    }
34    String reverse(String s , int l , int r){
35        char[] a = s.toCharArray();
36        while(l<r){
37        char temp = a[l];
38        a[l] = a[r];
39        a[r] = temp;
40        l++;
41        r--;
42       }
43       return new String(a);
44    }
45}