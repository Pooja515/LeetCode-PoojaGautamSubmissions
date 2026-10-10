// Last updated: 10/10/2026, 20:37:24
1class Solution {
2    public int[] maxProductPair(int[] nums, int target) {
3        int maxiproduct= Integer.MIN_VALUE;
4        int curri=-1 ,currj=-1;
5
6        for(int i=0;i<nums.length;i++){
7            for(int j=0;j<nums.length;j++){
8                if(i==j) continue;
9                if(nums[i]+nums[j] == target && nums[i] >nums[j]){
10                    int currproduct = nums[i]*nums[j];
11                    if(currproduct>maxiproduct){
12                        maxiproduct=currproduct;
13                        curri = i;
14                        currj= j;
15                        
16                    }
17                }
18            }
19        }
20        return new int[] {curri,currj};
21    }
22}