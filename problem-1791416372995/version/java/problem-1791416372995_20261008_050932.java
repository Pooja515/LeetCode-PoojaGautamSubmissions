// Last updated: 08/10/2026, 05:09:32
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
13        if(cur.size() == k){
14            res.add(new ArrayList<>(cur));
15            return;
16        }
17
18        for(int i=start;i<=n;i++){
19            cur.add(i);
20            f(i+1,n,k,res,cur);
21            cur.remove(cur.size()-1);
22        }
23
24    }
25}