// Last updated: 23/08/2026, 08:17:04
1class Solution {
2    public boolean isPalindromic(String s) {
3        StringBuilder s2 = new StringBuilder();
4        for(char c : s.toCharArray()){
5            int ascii = c;
6            
7            for(int i=7;i >= 0;i--){
8                if((ascii & (1 << i)) != 0){
9                    s2.append('1');
10                }
11                else{
12                    s2.append('0');
13                }
14            }
15        }
16        int l=0, r= s2.length()-1;
17        while(l<r){
18            if(s2.charAt(l) != s2.charAt(r)) return false;
19            l++;
20            r--;
21        }
22        return true;
23    }
24}