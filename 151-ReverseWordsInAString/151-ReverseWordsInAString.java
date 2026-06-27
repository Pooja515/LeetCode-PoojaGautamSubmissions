// Last updated: 28/06/2026, 01:04:08
class Solution {
    public String reverseWords(String s) {
        char[] arr=s.toCharArray();
        int n=arr.length;
        
        int newlen =cleanspace(arr,n);
       
        reverse(arr,0,newlen-1);
        int i=0;
        while(i<newlen){
            int j=i;
            while(j<newlen && arr[j]!=' ') j++;
            reverse(arr,i,j-1);
            i=j+1;
        }
         return new String(arr,0,newlen);
    }

    int cleanspace(char[] s,int n){
        int i=0,j=0;
        while(i<n){
             while(i<n && s[i]==' ') i++;
        while(i<n && s[i]!=' '){
            s[j++]=s[i++];
        }
         while(i<n && s[i]==' ') i++;
         if(i<n) s[j++]=' ';
        }
       return j;
    }

    void reverse(char[] s,int l,int r){
        while(l<r){
            char temp=s[l];
            s[l]=s[r];
            s[r]=temp;
            l++;
            r--;
        }
    }
}