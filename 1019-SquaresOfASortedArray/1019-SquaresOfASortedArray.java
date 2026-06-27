// Last updated: 28/06/2026, 01:02:19
class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int l=0,r=n-1,k=n-1;
        int[] arr=new int[n];
        while(l<=r){
            if(Math.abs(nums[l])>Math.abs(nums[r])){
                 arr[k--]=nums[l]*nums[l];
                 l++;
            }
            else{
                arr[k--]=nums[r]*nums[r];
                r--;
            }
        }
        return arr;
    }
}