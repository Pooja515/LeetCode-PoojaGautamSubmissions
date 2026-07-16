// Last updated: 16/07/2026, 17:58:16
1class Solution {
2    public boolean isAnagram(String s, String t) {
3        int m = s.length(), n = t.length();
4        if (n != m)
5            return false;
6
7        int[] freq = new int[26];
8
9        for (int i = 0; i < m; i++) {
10          
11            freq[s.charAt(i) - 'a']++;
12            freq[t.charAt(i) - 'a']--;
13
14        }
15    
16        for (int it : freq) {
17            if (it != 0)
18                return false;
19        }
20        return true;
21    }
22}