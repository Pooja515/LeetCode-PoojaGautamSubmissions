// Last updated: 20/08/2026, 21:12:10
1class Solution {
2    public int[] resultArray(int[] nums) {
3
4        List<Integer> a1 = new ArrayList<>();
5        List<Integer> a2 = new ArrayList<>();
6
7        a1.add(nums[0]);
8        a2.add(nums[1]);
9
10        for (int i = 2; i < nums.length; i++) {
11            int last1 = a1.get(a1.size() - 1);
12            int last2 = a2.get(a2.size() - 1);
13
14            if (last1 >= last2) {
15                a1.add(nums[i]);
16            } else {
17                a2.add(nums[i]);
18            }
19
20        }
21        int[] res = new int[nums.length];
22        int i = 0;
23        for (int num : a1) {
24            res[i++] = num;
25        }
26        for (int num : a2) {
27            res[i++] = num;
28        }
29        return res;
30    }
31}