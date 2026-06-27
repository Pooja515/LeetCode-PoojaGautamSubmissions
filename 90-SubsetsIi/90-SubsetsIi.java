// Last updated: 28/06/2026, 01:04:39
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>>  ans = new ArrayList<>();
        f(0, nums , new ArrayList<>() , ans);
        return ans;
    }
    void f(int ind , int[] nums ,List<Integer> ds , List<List<Integer>> ans){
        ans.add(new ArrayList<>(ds));
        for( int i = ind ;i<nums.length ; i++){
            if(i != ind && nums[i] == nums[i-1]) continue;
            ds.add(nums[i]);
            f(i+1 , nums , ds ,ans);
            ds.remove(ds.size() - 1);
        }
    }
}