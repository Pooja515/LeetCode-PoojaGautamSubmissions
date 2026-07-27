// Last updated: 27/07/2026, 13:35:20
1class Solution {
2    public String minWindow(String s, String t) {
3        int n = t.length(), m = s.length();
4        if (m < n) return "";
5
6        int[] freq = new int[128];
7        for (int i = 0; i < n; i++) {
8            char c = t.charAt(i);
9            freq[c]++;
10        }
11
12        int cnt = n, l = 0, minlen = Integer.MAX_VALUE, start = 0;
13
14        for (int r = 0; r < m; r++) {
15            char c = s.charAt(r);
16            if (freq[c] > 0) {
17                cnt--;
18            }
19            freq[c]--;
20
21            while (cnt == 0) {
22                if (r - l + 1 < minlen) {
23                    minlen = r - l + 1;
24                    start = l;
25                }
26
27                char left = s.charAt(l);
28                freq[left]++;
29                if (freq[left] > 0) {
30                    cnt++;
31                }
32                l++;
33            }
34        }
35
36        return minlen == Integer.MAX_VALUE ? "" : s.substring(start, start + minlen);
37    }
38}