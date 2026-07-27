// Last updated: 27/07/2026, 10:15:52
1class Solution {
2    public int totalFruit(int[] fruits) {
3        HashMap<Integer, Integer> map = new HashMap<>();
4        int l = 0, maxlen = 0;
5        for (int r = 0; r < fruits.length; r++) {
6            map.put(fruits[r], map.getOrDefault(fruits[r], 0) + 1);
7            while (map.size() > 2) {
8                map.put(fruits[l], map.get(fruits[l]) - 1);
9                if (map.get(fruits[l]) == 0) {
10                    map.remove(fruits[l]);
11                }
12                l++;
13            }
14            maxlen = Math.max(r - l + 1, maxlen);
15        }
16        return maxlen;
17    }
18}