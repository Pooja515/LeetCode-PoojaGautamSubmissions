// Last updated: 28/06/2026, 01:03:01
class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0,maxlen=0;
        map.put(0,-1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int rem=sum%k;
            if(map.containsKey(rem)){
                int len=i-map.get(rem);
                if(len>=2){
                    return true;
                }
            }
            else
                     map.put(rem,i);
        }
        return false;
    }
}