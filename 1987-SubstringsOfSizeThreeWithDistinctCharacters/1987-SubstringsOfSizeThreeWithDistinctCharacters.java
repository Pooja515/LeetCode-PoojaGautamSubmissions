// Last updated: 28/06/2026, 01:01:58
class Solution {
    public int countGoodSubstrings(String s) {
        int cnt=0;
        for(int r=2;r<s.length();r++){
            int a=s.charAt(r);
             int b=s.charAt(r-1);
              int c=s.charAt(r-2);
              if(a!=b && a!=c && b!=c) cnt++;
        }
        return cnt;
    }
}