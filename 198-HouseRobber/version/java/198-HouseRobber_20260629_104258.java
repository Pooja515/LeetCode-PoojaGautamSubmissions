// Last updated: 29/06/2026, 10:42:58
1class Solution {
2    int[] memo;
3    public int rob(int[] nums) {
4        int n = nums.length;
5        memo = new int[n];
6        Arrays.fill(memo, -1);
7        return f(n-1 , nums);
8    }
9    int f(int i , int[] nums){
10        if( i == 0) return nums[0];
11        if( i ==1 ) return Math.max(nums[0] , nums[1]);
12        if(memo[i] != -1) return memo[i];
13        int pick = nums[i] + f(i-2,nums);
14        int notpick = 0 + f(i-1 , nums);
15
16        return memo[i] = Math.max(pick , notpick);
17    }
18}