// Last updated: 22/07/2026, 00:16:28
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3       HashMap<Character ,Integer> map = new HashMap<>();
4       int l = 0 , maxlen = 0; 
5       for(int r = 0 ; r < s.length() ; r++){
6          if(map.containsKey(s.charAt(r))){
7             l = Math.max(l , map.get(s.charAt(r))+1);
8          }
9          map.put(s.charAt(r) , r);
10          maxlen = Math.max(maxlen , r-l+1);
11       } 
12       return maxlen;
13    }
14}