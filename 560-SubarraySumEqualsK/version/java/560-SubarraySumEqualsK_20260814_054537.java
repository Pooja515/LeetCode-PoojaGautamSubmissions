// Last updated: 14/08/2026, 05:45:37
1class Solution {
2    public int subarraySum(int[] nums, int k) {
3        HashMap<Integer,Integer> map = new HashMap<>();
4        map.put(0,1);
5
6        int rightsum =0 , cnt=0;
7
8        for(int i=0;i<nums.length;i++){
9            rightsum += nums[i];
10            if(map.containsKey(rightsum - k)){
11                cnt += map.get(rightsum - k);
12            }
13
14            map.put(rightsum,map.getOrDefault(rightsum,0)+1);
15        }
16        return cnt;
17    }
18}