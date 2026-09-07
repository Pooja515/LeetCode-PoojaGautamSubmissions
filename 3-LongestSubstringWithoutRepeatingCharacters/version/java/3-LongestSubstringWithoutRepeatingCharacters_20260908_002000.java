// Last updated: 08/09/2026, 00:20:00
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        HashMap<Character,Integer> map = new HashMap<>();
4        int l=0,maxi=0;
5        for(int r=0;r<s.length();r++){
6            if(map.containsKey(s.charAt(r))){
7                l= Math.max(l,map.get(s.charAt(r))+1);
8            }
9            maxi=Math.max(maxi,r-l+1);
10            map.put(s.charAt(r),r);
11            
12        }
13        return maxi;
14    }
15}