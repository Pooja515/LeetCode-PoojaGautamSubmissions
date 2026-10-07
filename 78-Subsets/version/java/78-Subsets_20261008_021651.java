// Last updated: 08/10/2026, 02:16:51
1class Solution {
2    public List<List<Integer>> subsets(int[] nums) {
3
4        List<List<Integer>> res = new ArrayList<>();//outer list
5        List<Integer> ans = new ArrayList<>();//inner list
6
7        f(0, nums, ans, res);
8
9        return res;
10    }
11
12    void f(int start, int[] nums, List<Integer> ans, List<List<Integer>> res) {
13        res.add(new ArrayList<>(ans));
14        for (int i = start; i < nums.length; i++) {
15            //take
16            ans.add(nums[i]);
17            f(i + 1, nums, ans, res);
18            //nottake i.e backtrack
19            ans.remove(ans.size() - 1);
20        }
21
22    }
23}