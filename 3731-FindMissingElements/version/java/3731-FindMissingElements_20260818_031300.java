// Last updated: 18/08/2026, 03:13:00
1class Solution {
2    public List<Integer> findMissingElements(int[] nums) {
3         List<Integer> ans = new ArrayList<>();
4         Set<Integer> set = new HashSet<>();
5
6         int mini=Integer.MAX_VALUE;
7         int maxi = Integer.MIN_VALUE;
8
9         for(int num : nums){  
10            mini = Math.min(mini ,num);
11            maxi= Math.max(maxi,num);
12            set.add(num);
13         }
14
15         for(int i = mini ;i <= maxi; i++){
16            if(!set.contains(i)) ans.add(i);
17         }
18
19         return ans;
20    }
21}