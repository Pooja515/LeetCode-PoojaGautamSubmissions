// Last updated: 03/09/2026, 01:26:20
1class Solution {
2    int[][] memo;
3    public int longestCommonSubsequence(String text1, String text2) {
4        int m = text1.length(), n = text2.length();
5        if (m == 0 || n == 0)
6            return 0;
7        memo = new int[m][n];
8        for(int[] rows: memo){
9            Arrays.fill(rows,-1);
10        }
11
12        return f(m - 1, n - 1, text1, text2);
13    }
14
15    int f(int ind1,int ind2 , String s1 , String s2){
16      if(ind1<0 || ind2<0){
17        return 0;
18      }
19
20      if(memo[ind1][ind2] != -1) return memo[ind1][ind2];
21        // choices
22        if(s1.charAt(ind1) == s2.charAt(ind2)){
23            return memo[ind1][ind2] = 1 + f(ind1-1 , ind2 - 1 ,s1,s2);
24        }
25
26        return memo[ind1][ind2] = Math.max(f(ind1-1,ind2,s1,s2) , f(ind1,ind2-1,s1,s2));
27    }
28}