// Last updated: 18/11/2026, 04:59:31
1class Solution {
2    public boolean isSubsequence(String s, String t) {
3        int n=s.length(),m=t.length();
4        int i=0,j=0;
5        while(i<n && j<m){
6            if(s.charAt(i)==t.charAt(j)){
7                i++;j++;
8            }
9            else
10                  j++;
11        }
12        return i==n;
13    }
14}