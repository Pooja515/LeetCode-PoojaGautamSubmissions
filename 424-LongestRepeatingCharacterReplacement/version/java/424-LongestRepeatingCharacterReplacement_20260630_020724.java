// Last updated: 30/06/2026, 02:07:24
/*
 * Approach : using sliding window left and right pointer and updating left the moment condition is not satisfied .
 * Time Complexity : O(N)
 * Space Complexity : O(1) // freq array as it contains only uppercase
*/

1class Solution {
2    public int characterReplacement(String s, int k) {
3       int[] freq = new int[26];
4
5       int l=0 , maxfreq=0, maxlen =0;
6       
7       for(int r = 0 ; r<s.length() ; r++){
8
9           freq[s.charAt(r)-'A']++;
10
11           maxfreq = Math.max(maxfreq , freq[s.charAt(r)- 'A']);
12
13           while(r-l+1 - maxfreq > k){
14              freq[s.charAt(l)-'A']--;
15              l++;
16           }
17           maxlen = Math.max(maxlen , r-l+1);
18       }
19       return maxlen;
20    }
21}
22