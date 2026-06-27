// Last updated: 28/06/2026, 01:02:45
class Solution {
    public int pivotIndex(int[] nums) {
        int totalsum=0;
        for(int i=0;i<nums.length;i++) totalsum+=nums[i];
        int leftsum=0;
        for(int r=0;r<nums.length;r++){
            int rightsum=totalsum-leftsum-nums[r];
            if(rightsum==leftsum) return r;
            leftsum+=nums[r];
        }
        return -1;
    }
}