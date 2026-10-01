// Last updated: 01/10/2026, 23:44:57
1class Solution {
2    public int findMin(int[] nums) {
3       int n= nums.length;
4       int low = 0, high = n-1;
5
6       while(low<high){
7        int mid = low+(high-low)/2;
8        if(nums[mid]<nums[high]){
9            high=mid;
10        }
11        else{
12            low=mid+1;
13        }
14       }
15       return nums[low];
16    }
17}