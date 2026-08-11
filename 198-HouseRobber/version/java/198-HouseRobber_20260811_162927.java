// Last updated: 11/08/2026, 16:29:27
1class Solution {
2    int[] memo ;
3    public int rob(int[] nums) {
4       int n = nums.length;
5       memo = new int[n];
6       Arrays.fill(memo,-1);
7       return f(n-1,nums); 
8    }
9    int f(int i , int[] nums){
10        //base case
11        if(i == 0 ) return nums[i];
12        if(i==1) return Math.max(nums[0],nums[1]);
13
14        if(memo[i] != -1) return memo[i];
15
16        // notake 
17        int nottake = 0 + f(i-1,nums);
18        int take = 0;
19        if(i>1){
20            take = nums[i] + f(i-2,nums);
21        }
22        return memo[i] = Math.max(take,nottake);
23    }
24}