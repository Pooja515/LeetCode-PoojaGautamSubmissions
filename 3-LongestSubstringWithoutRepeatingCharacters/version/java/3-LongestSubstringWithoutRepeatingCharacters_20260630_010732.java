// Last updated: 30/06/2026, 01:07:32
// The algorithm uses a HashMap that stores the most recent index for each distinct character. Therefore, the auxiliary space is O(min(n, Σ)), where Σ is the size of the character set. Under the given constraint of printable ASCII, Σ is bounded by 95, so the space is effectively O(1). In a more general setting without that constraint, the space complexity would be O(n).
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        HashMap<Character , Integer> map = new HashMap<>();
4            int l=0 , r=0 , maxlen =0 , n = s.length();
5            while(r < n){
6                char c = s.charAt(r);
7                if(map.containsKey(c)){
8                    l= Math.max(l, map.get(c)+1);
9                }
10                map.put(c, r);
11                maxlen = Math.max(maxlen , r-l+1);
12                r++;
13            }
14         return maxlen;
15    }
16}