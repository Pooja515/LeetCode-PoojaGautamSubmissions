// Last updated: 08/11/2026, 01:30:19
1class Solution {
2    public List<List<Integer>> subsets(int[] nums) {
3        List<List<Integer>> res = new ArrayList<>();
4        List<Integer> cur = new ArrayList<>();
5
6        f(0,nums,res,cur);
7
8        return res;
9    
10    }
11    
12    void f(int start,int[] nums,List<List<Integer>> res , List<Integer> cur){
13        res.add(new ArrayList<>(cur));
14
15        for(int i= start ;i<nums.length;i++){
16            cur.add(nums[i]);
17            f(i+1,nums,res,cur);
18            cur.remove(cur.size()-1);
19        }
20    }
21}