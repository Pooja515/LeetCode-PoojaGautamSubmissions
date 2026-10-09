// Last updated: 09/10/2026, 19:55:21
1class Solution {
2    public List<List<Integer>> subsets(int[] nums) {
3        List<List<Integer>> res= new ArrayList<>();
4        List<Integer> cur = new ArrayList<>();
5
6        f(0,nums,cur,res);
7
8        return res;
9        
10    }
11
12    void f(int start , int[] nums ,  List<Integer> cur ,List<List<Integer>> res ){
13       
14        res.add(new ArrayList<>(cur));
15           
16        for(int i=start;i<nums.length;i++){
17
18        cur.add(nums[i]); // take
19        f(i+1,nums,cur,res);
20        cur.remove(cur.size()-1); // backtracking i.e nottake
21       
22        }
23
24    }
25}