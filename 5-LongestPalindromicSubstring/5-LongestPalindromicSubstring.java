// Last updated: 28/06/2026, 01:05:37
class Solution {
    int start=0,maxlen=0;
    public String longestPalindrome(String s) {
      for(int i=0;i<s.length();i++){
        expansion(s,i,i);
        expansion(s,i,i+1);
      }  
      return s.substring(start,start+maxlen);
    }
    void  expansion(String s,int l,int r){
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
            l--;r++;
        }
        if(r-l-1 > maxlen){
            maxlen=r-l-1;
            start=l+1;
        }
    }
}