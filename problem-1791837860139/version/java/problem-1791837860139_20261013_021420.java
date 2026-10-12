// Last updated: 13/10/2026, 02:14:20
1class Solution {
2    public int findMaxConsecutiveOnes(int[] nums) {
3        int n = nums.length;
4        int cnt=0,maxi=0;
5        for(int r=0;r<n;r++){
6            if(nums[r] == 0) cnt=0;
7            else{
8                cnt++;
9            }
10            maxi=Math.max(maxi,cnt);
11        }
12        return maxi;
13    }
14}