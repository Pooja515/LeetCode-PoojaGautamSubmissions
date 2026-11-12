// Last updated: 13/11/2026, 01:43:25
1class Solution {
2    public int characterReplacement(String s, int k) {
3        int n = s.length();
4        int l = 0, maxlen = 0, maxfreq = 0;
5        int[] freq = new int[26];
6
7        for (int r = 0; r < n; r++) {
8            char c = s.charAt(r);
9            freq[c - 'A']++;
10            maxfreq = Math.max(maxfreq, freq[c - 'A']);
11            while ((r - l + 1) - maxfreq > k) {
12                int left = s.charAt(l);
13                freq[left - 'A']--;
14                l++;
15            }
16            maxlen = Math.max(maxlen, r - l + 1);
17        }
18        return maxlen;
19    }
20}