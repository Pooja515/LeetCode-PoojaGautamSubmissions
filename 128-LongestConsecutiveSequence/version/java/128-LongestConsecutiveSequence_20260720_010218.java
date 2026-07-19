// Last updated: 20/07/2026, 01:02:18
1class Solution {
2    public int longestConsecutive(int[] nums) {
3        HashSet<Integer> set = new HashSet<>();
4        int n = nums.length;
5        for (int i = 0; i < n; i++) {
6            set.add(nums[i]);
7        }
8
9        int maxlen = 0;
10
11        for (int num : set) {
12    
13            if (!set.contains(num - 1)) {
14                int x = num;
15                int cnt = 1;
16                while (set.contains(x+1)) {
17                    cnt++;
18                    x++;
19                }
20            maxlen = Math.max(maxlen, cnt);
21
22            }
23        }
24        return maxlen;
25    }
26}
27
28
29