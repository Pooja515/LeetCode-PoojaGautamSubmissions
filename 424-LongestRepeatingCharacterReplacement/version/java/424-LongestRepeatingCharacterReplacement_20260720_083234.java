// Last updated: 20/07/2026, 08:32:34
1class Solution {
2    public int characterReplacement(String s, int k) {
3        HashMap<Character , Integer> map = new HashMap<>();
4        int l=0 , maxfreq = 0, maxlen = 0;
5        for(int r=0 ; r<s.length() ; r++){
6            map.put(s.charAt(r) , map.getOrDefault(s.charAt(r),0)+1);
7            maxfreq = Math.max(maxfreq , map.get(s.charAt(r)));
8            if((r-l+1) - maxfreq >k){
9                map.put(s.charAt(l) , map.get(s.charAt(l))-1);
10                if(s.charAt(l) == 0) map.remove(s.charAt(l));
11                l++;
12            }
13            maxlen = Math.max(maxlen , r-l+1);
14        }
15        return maxlen;
16    }
17}