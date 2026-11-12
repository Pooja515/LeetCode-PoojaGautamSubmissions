// Last updated: 13/11/2026, 00:04:09
1class Solution {
2    public boolean isAnagram(String s, String t) {
3        int[] freq = new int[26];
4        int m = s.length(), n = t.length();
5        if (n < m || n>m)
6            return false;
7        for (int i = 0; i < m; i++) {
8            char c = s.charAt(i);
9            freq[c - 'a']++;
10        }
11        int cnt = m;
12        for(int i=0;i<n;i++){
13            char c= t.charAt(i);
14            freq[c-'a']--;
15            if(freq[c-'a'] >= 0) cnt--;
16            if(cnt==0) return true;
17        }
18        return false;
19    }
20}