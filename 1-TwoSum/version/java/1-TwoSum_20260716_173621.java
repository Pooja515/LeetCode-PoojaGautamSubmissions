// Last updated: 16/07/2026, 17:36:21
1class Solution {
2    public boolean isAnagram(String s, String t) {
3        int m = s.length() , n = t.length();
4        if(n != m) return false;
5
6        int[] freq = new int[26];
7
8        for(int i=0;i<m;i++){
9            char c = s.charAt(i);
10            freq[c-'a']++;
11        }
12         for(int i=0;i<m;i++){
13            char c = t.charAt(i);
14            freq[c-'a']--;
15        }
16        for(int it : freq){
17            if(it > 0) return false;
18        }
19        return true;
20    }
21}