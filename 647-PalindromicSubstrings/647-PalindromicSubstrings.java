// Last updated: 28/06/2026, 01:02:49
class Solution {
    int count=0;
    public int countSubstrings(String s) {
        for(int i=0;i<s.length();i++){
            expansion(s,i,i);
             expansion(s,i,i+1);
        }
        return count;
    }
     void expansion(String s,int l,int r){
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
            count++;
            l--;r++;
        }
        
     }
}