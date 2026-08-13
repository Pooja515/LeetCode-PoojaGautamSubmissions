// Last updated: 13/08/2026, 14:40:43
1class Solution {
2    int[][] memo;
3    public int lengthOfLIS(int[] nums) {
4      int n= nums.length;
5     
6      memo = new int[n][n+1];
7      for(int[] rows:memo){
8          Arrays.fill(rows,-1);
9      }
10
11      return f(0,-1,nums);  
12
13    }
14
15    int f(int ind , int prev_ind,int[] nums){
16
17        if(ind == nums.length) return 0;
18
19        if(memo[ind][prev_ind+1] != -1) return memo[ind][prev_ind+1];
20
21        //nottake
22        int nottake = 0 + f(ind+1,prev_ind,nums);
23        int take =0;
24        if(prev_ind == -1 || nums[ind] > nums[prev_ind]){
25             take =1 + f(ind+1,ind,nums);
26        }
27        int len = Math.max(take,nottake);
28        return memo[ind][prev_ind+1]= len;
29    }
30}