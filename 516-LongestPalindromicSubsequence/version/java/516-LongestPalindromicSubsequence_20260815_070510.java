// Last updated: 15/08/2026, 07:05:10
1class Solution {
2    int[][] memo;
3    public int longestPalindromeSubseq(String s) {
4        int n= s.length();
5        String s2 = new StringBuilder(s).reverse().toString();
6
7        memo= new int[n][n];
8        for(int[] rows:memo){
9            Arrays.fill(rows,-1);
10        }
11
12        return f(n-1,n-1,s,s2);
13    }
14    int f(int ind1 , int ind2,String s1,String s2){
15
16        //base case 
17        if(ind1 < 0 || ind2 < 0) return 0;
18
19        if(memo[ind1][ind2] != -1) return memo[ind1][ind2];
20
21        if(s1.charAt(ind1) == s2.charAt(ind2)){
22            return memo[ind1][ind2] = 1 + f(ind1-1,ind2-1,s1,s2);
23        }
24        return memo[ind1][ind2] = Math.max(f(ind1-1,ind2,s1,s2) , f(ind1,ind2-1,s1,s2));
25    }
26}