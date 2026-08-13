// Last updated: 13/08/2026, 21:53:09
1class Solution {
2    int[][] memo;
3    public int longestCommonSubsequence(String text1, String text2) {
4        int m = text1.length(), n = text2.length();
5
6        memo= new int[m][n];
7        for(int[] rows: memo){
8            Arrays.fill(rows,-1);
9        }
10
11        return f(m - 1, n - 1, text1, text2);
12    }
13
14    int f(int ind1, int ind2, String s1, String s2) {
15        // base case 
16        if (ind1 < 0 || ind2 < 0)
17            return 0;
18
19        if(memo[ind1][ind2] != -1) return memo[ind1][ind2];
20
21
22        if (s1.charAt(ind1) == s2.charAt(ind2))
23            return memo[ind1][ind2] = 1 + f(ind1 - 1, ind2 - 1, s1, s2);
24
25        return  memo[ind1][ind2] = Math.max(f(ind1 - 1, ind2, s1, s2), f(ind1, ind2 - 1, s1, s2));
26
27    }
28}