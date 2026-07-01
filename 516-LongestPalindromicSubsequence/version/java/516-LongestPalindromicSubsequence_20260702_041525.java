// Last updated: 02/07/2026, 04:15:25
1class Solution {
2    int[][] memo;
3    public int longestPalindromeSubseq(String s) {
4        int n = s.length();
5        memo = new int[n][n];
6        for(int[] row : memo){
7            Arrays.fill(row , -1);
8        }
9      
10        String s1 = reverse(s , 0 , n-1);
11        
12        return f(n-1,n-1,s,s1);
13    }
14    int f(int i, int j , String s , String s1){
15        if(i<0 || j<0) return 0;
16
17        if(memo[i][j] != -1){
18            return memo[i][j];
19        }
20
21        // match 
22        if(s.charAt(i) == s1.charAt(j))
23               return memo[i][j] = 1+ f(i-1 , j-1 , s,s1);
24    // not match 
25    return memo[i][j] = 0 + Math.max(f(i-1 , j , s, s1) , f(i,j-1,s , s1));
26    }
27
28     String reverse (String s , int l, int r){
29       char[] a = s.toCharArray();
30            
31        while (l<r){
32            char temp = a[l];
33            a[l] = a[r];
34            a[r] = temp;
35            l++;
36            r--;
37        }
38        return new String(a);
39    }
40}