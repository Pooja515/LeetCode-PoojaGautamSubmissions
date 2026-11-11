// Last updated: 11/11/2026, 18:24:21
1class Solution {
2    public List<Integer> findDuplicates(int[] nums) {
3        List<Integer> ans = new ArrayList<>();
4        HashSet<Integer> set = new HashSet<>();
5        for(int i=0;i<nums.length;i++){
6            if(set.contains(nums[i])){
7                ans.add(nums[i]);
8            }
9            else{
10                set.add(nums[i]);
11            }
12        }
13        return ans;
14    }
15}