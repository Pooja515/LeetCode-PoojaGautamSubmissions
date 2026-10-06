// Last updated: 06/10/2026, 05:34:19
1class Solution {
2
3    public int longestPalindromeSubseq(String s) {
4        int n = s.length();
5        String s2 = new StringBuilder(s).reverse().toString();
6
7        int[] dp=new int [n+1];
8         for(int i=0;i<=n;i++){
9              int[] cur=new int [n+1];
10            for(int j=0;j<=n;j++){
11                if(i==0 || j==0){
12                    cur[j]=0;
13                }
14                else{
15                    if(s.charAt(i-1) == s2.charAt(j-1)){
16                            cur[j] = 1+dp[j-1];
17                        }
18                 else{
19                        cur[j] = Math.max(dp[j],cur[j-1]);
20                      }
21                }
22            }
23            dp=cur;
24         }
25    return dp[n];
26    }
27}