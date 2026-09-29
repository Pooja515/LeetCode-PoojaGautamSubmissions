// Last updated: 30/09/2026, 03:48:30
1class Solution {
2    int[][] memo;
3    public int longestCommonSubsequence(String text1, String text2) {
4       int m= text1.length() , n=text2.length();
5
6       memo = new int[m][n];
7       for(int[] r:memo){
8          Arrays.fill(r,-1);
9       }
10
11       return f(m-1,n-1,text1,text2); 
12    }
13
14    int f(int i , int j , String s1 , String s2){
15        if(i<0 || j<0) return 0;
16
17        if(memo[i][j] != -1) return memo[i][j];
18
19        if(s1.charAt(i) == s2.charAt(j)){
20            return memo[i][j] = 1 + f(i-1,j-1,s1,s2);
21        }
22
23        return memo[i][j] = Math.max(f(i-1,j,s1,s2) , f(i,j-1,s1,s2));
24    }
25}