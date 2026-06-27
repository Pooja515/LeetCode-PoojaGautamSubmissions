// Last updated: 28/06/2026, 01:03:55
class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        rotate(0,n-1,nums);
        rotate(0,k-1,nums);
        rotate(k,n-1,nums);
    }
    void rotate(int l,int r,int[] nums){
        while(l<=r){
            int temp=nums[l];
            nums[l]=nums[r];
            nums[r]=temp;
            l++;
            r--;
        }
    }
}