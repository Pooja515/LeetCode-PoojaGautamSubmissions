// Last updated: 28/06/2026, 01:05:17
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
         List<List<Integer>> ans = new ArrayList<>();
         Arrays.sort(candidates);
         f(0,target,candidates,new ArrayList<>() ,ans);
         return ans;
    }
    void f(int ind , int target , int[] candidates, List<Integer> ds,List<List<Integer>> ans){
    
             if(target == 0){
                ans.add(new ArrayList<>(ds));
                return ;
        }
        for(int i = ind;i < candidates.length ; i++ ){
            if(candidates[i] > target) 
                  break;
            ds.add( candidates[i]);
            f(i, target -  candidates[i], candidates,ds,ans);
            ds.remove(ds.size()-1);
        }
    }
}