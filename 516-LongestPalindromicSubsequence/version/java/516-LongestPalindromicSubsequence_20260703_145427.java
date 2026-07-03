// Last updated: 03/07/2026, 14:54:27
1class Solution {
2    int[][] memo;
3    public int longestPalindromeSubseq(String s) {
4        int n = s.length();
5        String s2 = reverse(s, 0 , n-1);
6        int m = s2.length();
7        memo = new int[n][m];
8        for(int[] row : memo){
9            Arrays.fill(row , -1);
10        }
11
12        return f(n-1 , m-1 , s , s2);
13
14    }
15    int f(int i , int j , String s1 , String s2){
16        if(i< 0 || j<0) return 0;
17
18        if(memo[i][j] != -1) return memo[i][j];
19
20        if(s1.charAt(i) == s2.charAt(j)){
21            return  memo[i][j] = 1 + f(i-1 , j-1 , s1 ,s2);
22        }
23        return memo[i][j] = 0 + Math.max(f(i-1 , j , s1 , s2) , f(i,j-1 , s1 , s2));
24    }
25    String reverse(String s , int l , int r){
26        char[] a = s.toCharArray();
27        while(l<r){
28        char temp = a[l];
29        a[l] = a[r];
30        a[r] = temp;
31        l++;
32        r--;
33       }
34       return new String(a);
35    }
36}