// Last updated: 12/10/2026, 04:21:22
1class Solution {
2    public int sumOfSquares(int[] nums) {
3        int n=nums.length, sum=0;
4        for(int i=0;i<n;i++){
5            if(n % (i+1) == 0){
6                sum += nums[i]*nums[i];
7            }
8        }
9        return sum;
10    }
11}