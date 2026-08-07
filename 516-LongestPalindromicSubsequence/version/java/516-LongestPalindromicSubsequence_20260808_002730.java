// Last updated: 08/08/2026, 00:27:30
1class Solution {
2    int[][] memo;
3    public int longestPalindromeSubseq(String s) {
4        int m = s.length();
5        String s2 = new StringBuilder(s).reverse().toString();
6        memo = new int[m][m];
7        for(int[] rows : memo){
8            Arrays.fill(rows,-1);
9        }
10
11        return f(m-1,m-1,s,s2);
12        
13    }
14    int f(int ind1 , int ind2 , String s1 , String s2){
15
16        if(ind1 < 0 || ind2 < 0) return 0;
17
18        if(memo[ind1][ind2] != -1) return memo[ind1][ind2];
19        //matching 
20        if(s1.charAt(ind1) == s2.charAt(ind2)){
21            return memo[ind1][ind2] = 1+ f(ind1-1,ind2-1,s1,s2);
22        }
23        return memo[ind1][ind2] = Math.max(f(ind1-1,ind2,s1,s2),f(ind1,ind2-1,s1,s2));
24    }
25}