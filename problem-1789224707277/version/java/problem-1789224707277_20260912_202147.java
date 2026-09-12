// Last updated: 12/09/2026, 20:21:47
1class Solution {
2    public int countSpecialIntegers(int[] nums) {
3        Map<Integer, List<Integer>> map = new HashMap<>();
4        
5        for (int i = 0; i < nums.length; i++) {
6            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
7        }
8
9        int count = 0;
10
11        for (List<Integer> indices : map.values()) {
12
13            if (indices.size() != 3) {
14                continue;
15            }
16
17           
18            int firstGap = indices.get(1) - indices.get(0);
19            int secondGap = indices.get(2) - indices.get(1);
20
21            if (firstGap == secondGap) {
22                count++;
23            }
24        }
25
26        return count;
27    }
28}