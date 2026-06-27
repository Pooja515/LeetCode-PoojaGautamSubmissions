// Last updated: 28/06/2026, 01:05:22
class Solution {
    public void nextPermutation(int[] nums) {
       int n = nums.length;
       int point =-1;
       for(int i =  n-2 ; i>=0;i--){
        if(nums[i]<nums[i+1]){
            point = i;
            break;
        }
       } 
       if(point == -1){
           reverse(nums,0,n-1);
           return;
       }

       for(int i = n-1 ;i >= point ; i--){
            if(nums[i] > nums[point]){
                int temp = nums[point];
                nums[point] = nums[i];
                nums[i] = temp;
                break;
            }
       }
       reverse(nums,point +1,n-1);
    }
    void reverse(int[] nums , int s , int e){
        while(s<=e){
           int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
        }
               
    }
}