// Last updated: 01/07/2026, 08:13:45
/*
 * Approach : using Hashset to store unique elements and to form longest consecutivesequence length and return maxlen .
 * Time Complexity : O(N) 
 * Space Complexity : O(N)
*/

1class Solution {
2    public int longestConsecutive(int[] nums) {
3        HashSet<Integer> set = new HashSet<>();
4        int maxlen = 0;
5        for(int num : nums){
6            set.add(num);
7        }
8        for(int num:set){
9            if(!set.contains(num-1)){
10                int cnt = 1;
11                int x = num;
12                while(set.contains(x+1)){
13                     x=x+1;
14                     cnt++;
15                }
16                maxlen = Math.max(maxlen , cnt);
17            }
18        }
19        return maxlen;
20    }
21}