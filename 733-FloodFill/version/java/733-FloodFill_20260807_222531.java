// Last updated: 07/08/2026, 22:25:31
1class Solution {
2    int[][] memo;
3    public int longestCommonSubsequence(String text1, String text2) {
4        int m = text1.length() , n= text2.length();
5        memo = new int[m][n];
6        for(int[] rows : memo){
7            Arrays.fill(rows,-1);
8        }
9
10        return f(m-1,n-1,text1,text2);
11    }
12    int f(int ind1 ,int ind2 , String s1 , String s2){
13        if(ind1 < 0 || ind2 < 0) return 0;
14
15        if(memo[ind1][ind2] != -1) return memo[ind1][ind2];
16
17        // match
18        if(s1.charAt(ind1) == s2.charAt(ind2)){
19            return memo[ind1][ind2] = 1 + f(ind1-1,ind2-1,s1,s2);
20        }
21        //not match
22        return memo[ind1][ind2] = Math.max(f(ind1-1,ind2,s1,s2) , f(ind1,ind2-1,s1,s2));
23    }
24}