// Last updated: 07/09/2026, 21:39:45
1class Solution {
2    public int subarraySum(int[] nums, int k) {
3        HashMap<Integer,Integer> map = new HashMap<>();
4        map.put(0,1);
5        int sum =0,cnt =0;
6        for(int i=0;i<nums.length;i++){
7            sum += nums[i];
8           if(map.containsKey(sum-k)){
9                cnt += map.get(sum-k);
10            }
11          map.put(sum,map.getOrDefault(sum,0)+1);
12        }
13        
14        return cnt;
15    }
16}