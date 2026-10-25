// Last updated: 26/10/2026, 00:37:35
1class Solution {
2    int[][] memo;
3    public int longestCommonSubsequence(String text1, String text2) {
4        int m= text1.length() , n= text2.length();
5
6        memo = new int[m][n];
7        for(int[] rows:memo){
8            Arrays.fill(rows,-1);
9        }
10
11        return f(m-1,n-1,text1,text2);
12    }
13
14    int f(int i,int j,String s,String t){
15
16        if(i<0 || j<0) return 0;
17
18        if(memo[i][j] != -1) return memo[i][j];
19        if(s.charAt(i) == t.charAt(j)){
20            return memo[i][j] = 1 + f(i-1,j-1,s,t);
21        }
22        return  memo[i][j] =   Math.max(f(i-1,j,s,t),f(i,j-1,s,t));
23    }
24}