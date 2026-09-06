// Last updated: 06/09/2026, 22:29:37
1class Solution {
2    int[][] memo;
3    public int longestPalindromeSubseq(String s) {
4        int n = s.length();
5        String t = new StringBuilder(s).reverse().toString();
6
7        memo = new int[n][n];
8        for(int[] rows:memo){
9            Arrays.fill(rows,-1);
10        }
11
12        return f(n-1,n-1,s,t);
13
14    }
15    int f(int i , int j , String s , String t){
16        if(i<0 || j<0) return 0;
17
18        if(memo[i][j] != -1){
19            return memo[i][j];
20        }
21
22        if(s.charAt(i) == t.charAt(j)){
23            return  memo[i][j] = 1+ f(i-1,j-1,s,t);
24        }
25        return memo[i][j] = Math.max(f(i-1,j,s,t) , f(i,j-1,s,t));
26    }
27}