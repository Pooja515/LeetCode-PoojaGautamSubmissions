// Last updated: 08/08/2026, 22:43:14
1class Solution {
2    int[][] memo;
3    public int lengthOfLIS(int[] nums) {
4        int n = nums.length;
5        memo = new int[n][n+1];
6        for(int[] rows : memo){
7            Arrays.fill(rows,-1);
8        }
9
10        return f(0,-1,nums);
11    }
12   
13    
14    int f(int ind ,int prev_ind ,int[] nums){
15
16        if(ind == nums.length) return 0;
17
18        if(memo[ind][prev_ind+1] != -1) 
19                return memo[ind][prev_ind+1];
20
21        // not take 
22        int len= 0 + f(ind+1, prev_ind,nums);
23
24        //take 
25        if(prev_ind == -1 || nums[ind] > nums[prev_ind]){
26            int take = 1 + f(ind+1,ind,nums);
27            len = Math.max(len , take);
28        }
29
30       return memo[ind][prev_ind+1] = len;
31    }
32}