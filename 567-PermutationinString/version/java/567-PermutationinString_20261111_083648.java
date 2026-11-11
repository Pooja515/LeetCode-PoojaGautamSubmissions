// Last updated: 11/11/2026, 08:36:48
1class Solution {
2    public boolean checkInclusion(String s1, String s2) {
3
4        int m = s1.length() , n=s2.length();
5        if(m>n) return false;
6
7        int[] freq = new int[26];
8
9        for(int i=0;i<m;i++){
10            char c = s1.charAt(i);
11            freq[c-'a']++;
12        }
13
14        int l=0, cnt = m;
15
16        for(int r=0;r<n;r++){
17            char c = s2.charAt(r);
18            if(freq[c-'a'] > 0) cnt--;
19            freq[c-'a']--;
20
21            if(cnt == 0) return true;
22
23            if(r-l+1 == m){
24               char left = s2.charAt(l);
25               if(freq[left-'a'] >= 0) cnt++;
26               freq[left-'a']++;
27               l++;
28            }
29
30        }
31        return false;
32    }
33}