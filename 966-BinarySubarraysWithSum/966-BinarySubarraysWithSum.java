// Last updated: 28/06/2026, 01:02:24
class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int sum=0,cnt=0;
        for(int r=0;r<nums.length;r++){
            sum+=nums[r];
            if(map.containsKey(sum-goal)){
                cnt+=map.get(sum-goal);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return cnt;
    }
}