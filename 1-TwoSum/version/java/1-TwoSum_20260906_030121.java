// Last updated: 06/09/2026, 03:01:21
1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        HashMap<Integer,Integer> map = new HashMap<>();
4        int n = nums.length;
5        for(int i=0;i<n;i++){
6            if(map.containsKey(target-nums[i])){
7                 return new int[] {map.get(target-nums[i]) , i};
8            }
9            
10             map.put(nums[i],i);
11        }
12        return new int[] {-1,-1};
13    }
14}