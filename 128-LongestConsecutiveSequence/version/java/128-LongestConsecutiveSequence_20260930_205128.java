// Last updated: 30/09/2026, 20:51:28
1class Solution {
2    public int longestConsecutive(int[] nums) {
3
4        HashSet<Integer> set = new HashSet<>();
5        int maxlen = 0;
6        for (int num : nums) {
7            set.add(num);
8        }
9
10        for (int num : set) {
11            int cnt = 1;
12            if (!set.contains(num - 1)) {
13                int x = num;
14                while (set.contains(x + 1)) {
15                    cnt++;
16                    x++;
17                }
18                maxlen = Math.max(maxlen, cnt);
19            }
20        }
21
22        return maxlen;
23    }
24}