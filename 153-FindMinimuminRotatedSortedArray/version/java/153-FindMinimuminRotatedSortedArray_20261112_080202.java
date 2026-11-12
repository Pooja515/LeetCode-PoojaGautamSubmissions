// Last updated: 12/11/2026, 08:02:02
1class Solution {
2    public int findMin(int[] nums) {
3        int low=0, high = nums.length -1;
4
5        while(low < high){
6            int mid = low +(high-low)/2;
7            if(nums[mid] < nums[high]){
8                high =mid;
9
10            }
11            else {
12                low = mid+1;
13            }
14        }
15        return nums[low];
16    }
17}