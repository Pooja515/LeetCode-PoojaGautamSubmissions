// Last updated: 16/11/2026, 11:20:08
1class Solution {
2    int[][] memo;
3    public int lengthOfLIS(int[] nums) {
4        if(nums == null) return 0;
5        int n = nums.length;
6
7        memo = new int[n][n+1];
8        for(int[] rows : memo){
9            Arrays.fill(rows,-1);
10        }
11
12        return f(0,-1,nums);
13    }
14
15    int f(int ind , int prev_ind,int[] nums){
16        if(ind == nums.length) return 0;
17
18        if(memo[ind][prev_ind +1] != -1) return memo[ind][prev_ind+1];
19
20        int nottake = 0+ f(ind+1,prev_ind,nums);
21        int take =0;
22        if(prev_ind == -1 || nums[ind] > nums[prev_ind]){
23            take = 1 + f(ind+1,ind,nums);
24        }
25
26        return memo[ind][prev_ind+1] = Math.max(take ,nottake);
27    }
28}