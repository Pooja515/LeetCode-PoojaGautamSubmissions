// Last updated: 28/06/2026, 01:03:27
class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length,xor=0;
        for(int i=0;i<nums.length;i++){
             xor^=nums[i]^i;
        }
        return xor^n;
    }
}