// Last updated: 28/06/2026, 01:03:00
class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        int sum=0,maxlen=0;
        for(int r=0;r<nums.length;r++){
           if(nums[r]==0) sum+=-1;
           else
                 sum+=nums[r];
           if(map.containsKey(sum)){
               maxlen=Math.max(maxlen,r-map.get(sum));
           }
           else 
                 map.put(sum,r); 
        }
        return maxlen;
    }
}