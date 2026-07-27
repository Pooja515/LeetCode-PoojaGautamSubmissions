// Last updated: 27/07/2026, 07:35:34
1class Solution {
2    public boolean checkInclusion(String s1, String s2) {
3        int n = s1.length(), m = s2.length();
4        if(m<n) return false;
5        int[] freq = new int[26];
6        for (int i = 0; i < n; i++) {
7            char c = s1.charAt(i);
8            freq[c - 'a']++;
9        }
10        int cnt = n , l=0;
11        for(int r =0 ; r<m;r++){
12            char c = s2.charAt(r);
13            if(freq[c-'a']>0) cnt--;
14            freq[c - 'a']--;
15            if(cnt == 0) return true;
16
17            if(r-l+1 == n){
18                 char left = s2.charAt(l);
19                 if( freq[left - 'a'] >=0) cnt++;
20                 freq[left - 'a']++;
21                 l++;
22            }
23        }
24        return false;
25    }
26}
27        
28          