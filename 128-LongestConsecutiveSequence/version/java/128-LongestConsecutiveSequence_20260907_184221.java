// Last updated: 07/09/2026, 18:42:21
1class Solution {
2    public int longestConsecutive(int[] nums) {
3        HashSet<Integer> set = new HashSet<>();
4        for(int num : nums){
5           set.add(num);
6        }
7        int maxi=0;
8        for(int num : set){
9            if(!set.contains(num-1)){
10                int cnt = 1;
11                int x = num;
12                while(set.contains(x+1)){
13                    cnt++;
14                    x++;
15                }
16                maxi= Math.max(maxi,cnt);
17            }
18        }
19        return maxi;
20    }
21}