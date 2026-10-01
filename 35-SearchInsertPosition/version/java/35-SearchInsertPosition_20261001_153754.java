// Last updated: 01/10/2026, 15:37:54
1class Solution {
2    public int searchInsert(int[] nums, int target) {
3        int n = nums.length;
4        int low=0 ,high=n-1,ans=n;
5
6        while(low <= high){
7            int mid = low+(high-low)/2;
8            if(nums[mid] >= target) {
9                ans=mid;
10                high=mid-1;
11            }
12            else{
13               low=mid+1;
14            }
15                
16        }
17
18        return ans;
19
20    }
21}