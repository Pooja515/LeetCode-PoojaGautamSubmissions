// Last updated: 16/07/2026, 17:59:08
1class Solution {
2    public boolean isAnagram(String s, String t) {
3        if (s.length() != t.length()) {
4            return false;
5        }
6
7        int[] freq = new int[26];
8
9        for (int i = 0; i < s.length(); i++) {
10            freq[s.charAt(i) - 'a']++;
11            freq[t.charAt(i) - 'a']--;
12        }
13
14        for (int num : freq) {
15            if (num != 0) {
16                return false;
17            }
18        }
19
20        return true;
21    }
22}