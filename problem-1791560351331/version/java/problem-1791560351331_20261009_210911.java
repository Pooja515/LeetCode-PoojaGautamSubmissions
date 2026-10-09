// Last updated: 09/10/2026, 21:09:11
1class Solution {
2    public List<List<Integer>> combine(int n, int k) {
3        List<List<Integer>> res= new ArrayList<>();
4        List<Integer> cur = new ArrayList<>();
5
6        f(1,n,k,res,cur);
7
8        return res;
9        
10    }
11
12    void f(int start,int n,int k , List<List<Integer>>res, List<Integer> cur){
13        
14        if(cur.size() == k){
15            res.add(new ArrayList<>(cur));
16            return;
17        }
18
19        for(int i=start;i<=n;i++){
20            cur.add(i);
21            f(i+1,n,k,res,cur);
22            cur.remove(cur.size()-1);
23        }
24
25    }
26}