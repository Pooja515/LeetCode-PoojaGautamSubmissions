// Last updated: 04/10/2026, 04:35:04
1class Solution {
2    int[][] memo ;
3    public int longestPalindromeSubseq(String s) {
4        int n = s.length();
5        String s2 = new StringBuilder(s).reverse().toString();
6
7        memo=new int[n][n];
8        for(int[] r:memo){
9            Arrays.fill(r,-1);
10        }
11
12        return f(n-1,n-1,s,s2);
13    }
14
15    int f(int i,int j,String s1,String s2){
16
17        if(i<0 || j<0) return 0;
18
19        if(memo[i][j] != -1) return memo[i][j];
20        if(s1.charAt(i) == s2.charAt(j)){
21            return memo[i][j] = 1+f(i-1,j-1,s1,s2);
22        }
23        return memo[i][j] = Math.max(f(i-1,j,s1,s2),f(i,j-1,s1,s2));
24    }
25}