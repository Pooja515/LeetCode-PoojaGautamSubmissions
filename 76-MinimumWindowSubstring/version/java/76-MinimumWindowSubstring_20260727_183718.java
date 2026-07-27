// Last updated: 27/07/2026, 18:37:18
1class Solution {
2    public int subarraySum(int[] nums, int k) {
3        Map<Integer, Integer> map = new HashMap<>();
4        map.put(0, 1);
5
6        int sum = 0 ,count = 0;
7
8        for (int num : nums) {
9
10            sum += num;
11
12            int leftsum = sum - k;
13
14            count += map.getOrDefault(leftsum, 0);
15
16            map.put(sum,map.getOrDefault(sum, 0) + 1);
17        }
18      return count;
19    }
20}