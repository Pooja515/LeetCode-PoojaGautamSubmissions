// Last updated: 07/10/2026, 18:33:39
1class Solution {
2    public List<List<Integer>> subsets(int[] nums) {
3
4        List<List<Integer>> res = new ArrayList<>();//outer list
5        List<Integer> ans=new ArrayList<>();//inner list
6        
7        f(0,nums,ans,res);
8
9        return res;
10    }
11   
12    void f(int i,int[] nums,List<Integer> ans,List<List<Integer>> res){
13        if(i==nums.length){
14            res.add(new ArrayList<>(ans));
15            return;
16        }
17
18        //take
19        ans.add(nums[i]);
20        f(i+1,nums,ans,res);
21        //nottake i.e backtrack
22        ans.remove(ans.size()-1);
23        f(i+1,nums,ans,res);
24
25    }
26}