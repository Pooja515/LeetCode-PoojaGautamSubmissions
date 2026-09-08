// Last updated: 08/09/2026, 19:51:09
1class Solution {
2    public int minSubArrayLen(int target, int[] nums) {
3      int n = nums.length ,l=0,sum=0, mini = Integer.MAX_VALUE;
4      for(int r=0;r<n;r++){
5          sum += nums[r];
6          while(sum >= target){
7            mini = Math.min(mini, r-l+1);
8            sum -= nums[l];
9            l++;
10          }
11      }
12      return mini == Integer.MAX_VALUE ? 0:mini;
13
14    }
15}