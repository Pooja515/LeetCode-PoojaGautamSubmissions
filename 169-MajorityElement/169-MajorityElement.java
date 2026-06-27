// Last updated: 28/06/2026, 01:03:54
class Solution {
    public int majorityElement(int[] nums) {
        int cnt= 0, ele =0;
        for(int i=0;i<nums.length;i++){
            if(cnt== 0){
                cnt=1;
                ele = nums[i];
            }
            else if( ele== nums[i]) cnt++;
            else
                  cnt--;

        }
        return ele;
    }
}