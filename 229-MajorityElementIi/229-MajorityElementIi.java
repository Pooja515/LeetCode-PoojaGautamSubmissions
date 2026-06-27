// Last updated: 28/06/2026, 01:03:35
class Solution {
    public List<Integer> majorityElement(int[] nums) {
         List<Integer> res=new ArrayList<>();
        int cnt1=0 , cnt2=0 , ele1 = Integer.MAX_VALUE  ,ele2 = Integer.MIN_VALUE;
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(cnt1 == 0  && nums[i] != ele2){
                cnt1=1;
                ele1 = nums[i];
            }
            else if(cnt2 == 0  && nums[i] != ele1){
                cnt2 =1;
                ele2 =nums[i];
            }
            else if(ele1 == nums[i]) cnt1++;
            else if(ele2 == nums[i]) cnt2++;
            else{
                cnt1--;
                cnt2--;
            }
        }

      int cnt3=0,cnt4 =0;    
      for(int i=0;i<nums.length;i++){
         if(ele1==nums[i]) cnt3++;
         if(ele2==nums[i]) cnt4++;
      }
      if(cnt3>nums.length/3) res.add(ele1);
    
      if(cnt4>nums.length/3) res.add(ele2);

      return res;
    }
}