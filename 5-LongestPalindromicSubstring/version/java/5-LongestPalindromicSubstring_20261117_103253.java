// Last updated: 17/11/2026, 10:32:53
1class Solution {
2    int start =0, maxlen =0;
3    public String longestPalindrome(String s) {
4        for(int i=0;i<s.length();i++){
5            expand(i,i,s);
6            expand(i,i+1,s);
7        }
8
9        return s.substring(start,start + maxlen);
10    }
11    void expand(int l,int r,String s){
12        while(l>= 0 && r<s.length() && s.charAt(l) == s.charAt(r)){
13            l--;
14            r++;
15        }
16
17        if(r-l-1 > maxlen){
18            maxlen = r-l-1;
19            start = l+1;
20        }
21    }
22}