// Last updated: 02/10/2026, 01:33:58
1class Solution {
2    int[][] memo;
3    public int longestCommonSubsequence(String text1, String text2) {
4        int m=text1.length() , n=text2.length();
5        memo = new int[m][n];
6        for(int[] rows:memo){
7            Arrays.fill(rows,-1);
8        }
9
10        return f(m-1,n-1,text1,text2);
11    }
12
13    int f(int i,int j,String s1,String s2){
14        if(i<0 || j<0) return 0;
15
16        if(memo[i][j] != -1) return memo[i][j];
17        if(s1.charAt(i) == s2.charAt(j)){
18            return memo[i][j] =1 + f(i-1,j-1,s1,s2);
19        }
20        return  memo[i][j]=Math.max(f(i-1,j,s1,s2),f(i,j-1,s1,s2));
21    }
22}