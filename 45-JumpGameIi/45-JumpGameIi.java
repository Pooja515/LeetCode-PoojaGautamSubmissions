// Last updated: 28/06/2026, 01:05:13
class Solution {
    public int jump(int[] nums) {
       int maxReach=0,jump=0,currend=0;
       for(int i=0;i<nums.length-1;i++){
        maxReach=Math.max(maxReach,i+nums[i]);
        if(i==currend){
            jump++;
            currend=maxReach;
        }
       } 
       return jump;
    }
}