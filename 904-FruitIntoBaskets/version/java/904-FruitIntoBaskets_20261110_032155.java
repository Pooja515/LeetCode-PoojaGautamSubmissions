// Last updated: 10/11/2026, 03:21:55
1class Solution {
2    public int totalFruit(int[] fruits) {
3        int n = fruits.length;
4        HashMap<Integer, Integer> map = new HashMap<>();
5        int l = 0, maxlen = 0;
6        for (int r = 0; r < n; r++) {
7            map.put(fruits[r],map.getOrDefault(fruits[r],0)+1);
8            if (map.size() > 2) {
9                map.put(fruits[l], map.get(fruits[l]) - 1);
10                if (map.get(fruits[l]) == 0) {
11                    map.remove(fruits[l]);
12                }
13                l++;
14            }
15
16            maxlen = Math.max(maxlen, r - l + 1);
17        }
18        return maxlen;
19    }
20}