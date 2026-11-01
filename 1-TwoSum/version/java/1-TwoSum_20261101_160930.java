// Last updated: 01/11/2026, 16:09:30
1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        HashMap<Integer, Integer> map = new HashMap<>();
4        for(int i = 0; i < nums.length; i++) {
5          if(map.containsKey(target-nums[i])){
6            return new int[] {map.get(target-nums[i]),i};
7          }
8          map.put(nums[i],i);
9        }
10
11        return new int[] {-1,-1};
12    }
13}