// Last updated: 06/09/2026, 16:16:34
1class Solution {
2    int[][] memo;
3    public int numDistinct(String s, String t) {
4        int m = s.length() , n= t.length();
5        if(m < n) return 0;
6        memo= new int[m][n];
7        for(int[] rows : memo){
8            Arrays.fill(rows,-1);
9        }
10
11        return f(m-1,n-1,s,t);
12    }
13    int f(int i,int j,String s, String t){
14        if(j<0) return 1;
15        if(i<0) return 0;
16        int take =0 ,nottake =0;
17
18        if(memo[i][j] != -1) return memo[i][j];
19      
20        if(s.charAt(i) == t.charAt(j)){
21            take =f(i-1, j-1,s,t) + f(i-1,j,s,t);
22        }
23        else 
24               nottake= f(i-1,j,s,t);
25
26        return memo[i][j] = take + nottake;
27       
28    }
29}