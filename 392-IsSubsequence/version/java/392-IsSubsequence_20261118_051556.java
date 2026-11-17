// Last updated: 18/11/2026, 05:15:56
1class Solution {
2    public boolean isSubsequence(String s, String t) {
3        int m = s.length() , n=t.length();
4        if(m==0) return true;
5        int l=0 ,cnt = m;
6
7        for(int r=0 ;r<n;r++){
8            if(s.charAt(l) == t.charAt(r)){
9                cnt--;
10                l++;
11               
12            }
13           if(cnt == 0) return true;
14       
15        }
16        return false;
17    }
18}