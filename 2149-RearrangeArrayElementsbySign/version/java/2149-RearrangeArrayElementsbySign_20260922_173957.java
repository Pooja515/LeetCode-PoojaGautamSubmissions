// Last updated: 22/09/2026, 17:39:57
1class Solution {
2    public int[] rearrangeArray(int[] nums) {
3        int n= nums.length;
4        int[] ans = new int[n];
5        int posindex =0,negindex=1;
6        for(int i=0;i<n;i++){
7            if(nums[i] >= 0){
8                ans[posindex] = nums[i];
9                posindex +=2;
10            }
11            else{
12                ans[negindex] = nums[i];
13                negindex +=2;
14            }
15        }
16        return ans;
17    }
18}