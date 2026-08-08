// Last updated: 08/08/2026, 16:43:30
1class Solution {
2    int[][] memo;
3    public int numDistinct(String s, String t) {
4        int m = s.length() , n= t.length();
5        if(m <n) return 0;
6
7        memo= new int[m][n];
8        for(int[] rows:memo){
9            Arrays.fill(rows,-1);
10        }
11
12        return f(m-1,n-1,s,t);
13
14    }
15    int f(int ind1,int ind2,String s1,String s2){
16        if(ind2 <0) return 1;
17        if(ind1 < 0) return 0;
18
19        if(memo[ind1][ind2] != -1) return memo[ind1][ind2];
20
21        //match 
22        if(s1.charAt(ind1) == s2.charAt(ind2))
23              return memo[ind1][ind2]= f(ind1-1,ind2-1,s1,s2) + f(ind1-1,ind2,s1,s2);
24        
25        return memo[ind1][ind2]=f(ind1-1,ind2,s1,s2);
26    }
27}