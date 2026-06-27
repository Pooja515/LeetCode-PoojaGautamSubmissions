// Last updated: 28/06/2026, 01:02:05
class Solution {
    public int longestSubarray(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int l=0,maxlen=0;
        for(int r=0;r<nums.length;r++){
            if(nums[r]==0){
                 if(map.containsKey(nums[r])){
                        l=Math.max(l,map.get(nums[r])+1);
                 }

            }
            map.put(nums[r],r);
            maxlen=Math.max(maxlen,r-l+1);
        }
       return  maxlen-1;
    }
}