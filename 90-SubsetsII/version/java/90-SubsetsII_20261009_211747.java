// Last updated: 09/10/2026, 21:17:47
1class Solution {
2    public List<List<Integer>> subsetsWithDup(int[] nums) {
3        List<List<Integer>> res = new ArrayList<>(); // Stores all subsets
4        List<Integer> cur = new ArrayList<>(); // Mutable list, changes during backtracking
5         
6        Arrays.sort(nums);
7
8        f(0, nums, cur, res);
9
10        return res;
11    }
12
13    void f(int start, int[] nums, List<Integer> cur,
14            List<List<Integer>> res) {
15
16        // Save a COPY because cur will change during backtracking
17        res.add(new ArrayList<>(cur));
18
19        // No explicit base case needed. The loop stops when start == nums.length
20        for (int i = start; i < nums.length; i++) {
21            
22            if(i>start && nums[i] == nums[i-1]) continue;
23
24            cur.add(nums[i]); // Choose an element
25            f(i + 1, nums, cur, res); // Explore remaining elements
26            cur.remove(cur.size() - 1); // Undo the choice (backtrack)
27        }
28    }
29
30}
31