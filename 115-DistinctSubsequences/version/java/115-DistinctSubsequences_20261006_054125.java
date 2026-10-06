// Last updated: 06/10/2026, 05:41:25
1class Solution {
2    int[][] memo;
3    public int numDistinct(String s, String t) {
4        int m=s.length(),n=t.length();
5        memo=new int[m][n];
6        for(int[] r:memo){
7            Arrays.fill(r,-1);
8        }
9
10        return f(m-1,n-1,s,t);
11    }
12    int f(int i,int j,String s , String t){
13        if(j<0) return 1;
14        if(i<0) return 0;
15
16        if(memo[i][j] != -1) return memo[i][j];
17
18        if(s.charAt(i) == t.charAt(j)){
19            return memo[i][j]=f(i-1,j-1,s,t)+f(i-1,j,s,t);
20        }
21        return memo[i][j]=f(i-1,j,s,t);
22    }
23}