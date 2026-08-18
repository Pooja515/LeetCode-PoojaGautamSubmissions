// Last updated: 19/08/2026, 00:34:18
1class Solution {
2    public int largestInteger(int[] nums, int k) {
3
4        Map<Integer, Integer> map = new HashMap<>();
5        for (int i = 0; i <= nums.length - k; i++) {
6
7            Set<Integer> set = new HashSet<>();
8
9            // Put elements of current window into set
10            for (int j = i; j < i + k; j++) {
11                set.add(nums[j]);
12            }
13
14            // Count this number once for this window
15            for (int num : set) {
16                map.put(num, map.getOrDefault(num, 0) + 1);
17            }
18        }
19
20        int answer = -1;
21
22        for (int num : map.keySet()) {
23            if (map.get(num) == 1) {
24                answer = Math.max(answer, num);
25            }
26        }
27
28        return answer;
29    }
30}