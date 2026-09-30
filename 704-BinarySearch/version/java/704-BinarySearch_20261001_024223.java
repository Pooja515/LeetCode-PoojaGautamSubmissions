// Last updated: 01/10/2026, 02:42:23
1class Solution {
2    public int search(int[] nums, int target) {
3        int n=nums.length;
4        int low =0 , high = n-1;
5
6        while(low <= high){
7            int mid = low +(high-low)/2;
8            if(nums[mid] == target) return mid;
9
10            else if(nums[mid] < target) low =mid+1;
11            else
12                 high=mid-1;
13        }
14
15        return -1;
16
17    }
18}