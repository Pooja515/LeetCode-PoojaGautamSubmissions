// Last updated: 28/06/2026, 01:03:17
class Solution {
    public void reverseString(char[] s) {
        int n= s.length;
        for(int i=0;i<n/2;i++){
            char temp=s[i];
            s[i]=s[n-i-1];
            s[n-i-1]=temp;
        }
    }
}