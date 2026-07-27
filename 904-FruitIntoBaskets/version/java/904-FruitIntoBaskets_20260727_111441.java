// Last updated: 27/07/2026, 11:14:41
1class Solution {
2    public int minSubArrayLen(int target, int[] nums) {
3        int l=0, minlen = Integer.MAX_VALUE, sum=0;
4        for(int r = 0 ; r < nums.length ; r++){
5           sum += nums[r];
6           while(sum >= target){
7            minlen = Math.min(r-l+1 , minlen);
8             sum -= nums[l];
9             l++;   
10           }
11        }
12        return minlen == Integer.MAX_VALUE ? 0 : minlen;
13    }
14}