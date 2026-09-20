// Last updated: 20/09/2026, 08:54:57
1class Solution {
2    public int reverseDegree(String s) {
3        int res=0;
4        for(int i=0;i<s.length();i++){
5           int rev = 26 - (s.charAt(i) - 'a');
6           res += rev *(i+1);
7        }
8        
9        return res;
10    }
11}