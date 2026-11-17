// Last updated: 17/11/2026, 10:46:05
1class Solution {
2    int cnt=0;
3    public int countSubstrings(String s) {
4        for(int i=0;i<s.length();i++){
5            expand(i,i,s);
6            expand(i,i+1,s);
7        }
8        return cnt;
9
10    }
11    void expand(int l,int r,String s){
12        while(l>=0 && r<s.length() && s.charAt(l) == s.charAt(r)){
13            cnt++;
14            l--;
15            r++;
16        }
17    }
18}