// Last updated: 11/11/2026, 00:33:58
1class Solution {
2    public int longestConsecutive(int[] nums) {
3       HashSet<Integer> set = new HashSet<>();
4       for(int num:nums){
5        set.add(num);
6       } 
7       int maxlen=0;
8       for(int num : set){
9        if(!set.contains(num-1)){
10            int x=num;
11            int cnt =1;
12            while(set.contains(x+1)){
13                x=x+1;
14                cnt++;
15            }
16            maxlen = Math.max(maxlen , cnt);
17        }
18       }
19       return maxlen;
20    }
21}