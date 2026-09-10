// Last updated: 11/09/2026, 03:32:46
1class Solution {
2    public int removeDuplicates(int[] nums) {
3      int i =0 , n= nums.length;
4      for(int j=0;j<n;j++){
5        if(nums[i] != nums[j]){
6            nums[i+1] = nums[j];
7            i++;
8        }
9      }  
10      return i+1;
11    }
12}