// Last updated: 17/09/2026, 02:54:08
1class Solution {
2    public int characterReplacement(String s, int k) {
3       int l=0 ,maxfreq =0,cnt =0,maxi=0;
4       HashMap<Character,Integer> map = new HashMap<>();
5       for(int r=0;r<s.length();r++){
6         map.put(s.charAt(r),map.getOrDefault(s.charAt(r),0)+1);
7          maxfreq=Math.max(map.get(s.charAt(r)),maxfreq);
8          while((r-l+1) -maxfreq > k){
9            map.put(s.charAt(l),map.get(s.charAt(l))-1);
10            if(map.get(s.charAt(l))== 0) map.remove(s.charAt(l));
11            l++;
12          }
13        maxi=Math.max(maxi,r-l+1);
14       } 
15       return maxi;
16    }
17}