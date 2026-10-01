// Last updated: 01/10/2026, 14:55:56
1class Solution {
2    public int searchInsert(int[] nums, int target) {
3        int n = nums.length;
4        int low=0 ,high=n-1,ans=n;
5
6        while(low <= high){
7            int mid = low+(high-low)/2;
8
9            if(nums[mid] == target) return mid;
10            else if(nums[mid] >= target) {
11                ans=mid;
12                high=mid-1;
13            }
14            else{
15               low=mid+1;
16            }
17                
18        }
19
20        return ans;
21
22    }
23}