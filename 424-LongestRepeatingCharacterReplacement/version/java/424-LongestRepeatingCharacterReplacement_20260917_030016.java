// Last updated: 17/09/2026, 03:00:16
1class Solution {
2    public int characterReplacement(String s, int k) {
3      int l=0,maxfreq=0,maxlen=0;
4      int[] freq = new int[26];
5      for(int r=0;r<s.length();r++){
6        char c=s.charAt(r);
7        freq[c-'A']++;
8        maxfreq = Math.max(maxfreq, freq[c-'A']);
9        while(r-l+1-maxfreq > k){
10            char left = s.charAt(l);
11            freq[left-'A']--;
12            l++;
13        }
14        maxlen = Math.max(maxlen,r-l+1);
15      }  
16      return maxlen;
17    }
18}