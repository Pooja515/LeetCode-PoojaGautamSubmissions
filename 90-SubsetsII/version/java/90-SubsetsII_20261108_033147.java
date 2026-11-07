// Last updated: 08/11/2026, 03:31:47
1class Solution {
2    public List<List<Integer>> subsetsWithDup(int[] nums) {
3         List<List<Integer>> res = new ArrayList<>();
4         List<Integer> cur = new ArrayList<>();
5         Arrays.sort(nums);
6
7         f(0,nums,cur,res);
8
9         return res;
10
11    }
12    void f(int start , int[] nums,List<Integer> cur ,List<List<Integer>> res){
13        res.add(new ArrayList<>(cur));
14
15        for(int i=start;i<nums.length;i++){
16            if(i>start && nums[i] == nums[i-1]) continue;
17            cur.add(nums[i]);
18            f(i+1,nums,cur,res);
19            cur.remove(cur.size()-1);
20        }
21    }
22}