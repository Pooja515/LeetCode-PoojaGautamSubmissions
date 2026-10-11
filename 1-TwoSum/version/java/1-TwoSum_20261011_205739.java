// Last updated: 11/10/2026, 20:57:39
1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        HashMap<Integer,Integer> map = new HashMap<>();
4
5        for(int i=0;i<nums.length;i++){
6            if(map.containsKey(target-nums[i])){
7                return new int[] {i,map.get(target-nums[i])};
8            }
9            map.put(nums[i],i);
10        }
11        return new int[] {-1,-1};
12    }
13}