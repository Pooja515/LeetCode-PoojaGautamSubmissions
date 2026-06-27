// Last updated: 28/06/2026, 01:05:40
class Solution {
    public int lengthOfLongestSubstring(String s) {
       HashMap<Character,Integer> map=new HashMap<>();
       int l=0,maxi=Integer.MIN_VALUE;
       if(s.length()==0) return 0;
       for (int r=0;r<s.length();r++){
        char c=s.charAt(r);
        if(map.containsKey(c)){
            l=Math.max(l,map.get(c)+1);
        }
        maxi=Math.max(maxi,r-l+1);
        map.put(c,r);
       }
       return maxi;
    }
}