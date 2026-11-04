// Last updated: 04/11/2026, 17:57:49
1class Solution {
2    public int majorityElement(int[] nums) {
3      int cnt =0 , ele =0;
4      for(int i=0;i<nums.length;i++){
5        if(cnt == 0){
6            ele = nums[i];
7            cnt =1;
8        }
9        else if(nums[i] == ele) cnt++;
10        else{
11            cnt--;
12        }
13      } 
14      return ele; 
15    }
16}