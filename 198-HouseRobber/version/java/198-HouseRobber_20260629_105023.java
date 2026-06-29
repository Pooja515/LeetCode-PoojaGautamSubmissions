// Last updated: 29/06/2026, 10:50:23
/*
 * Approach : Using variable for space optimization instead of dp array to store previous results.
 * Time Complexity : O(N)
 * Space Complexity : O(1)
*/

1class Solution {
2  
3    public int rob(int[] nums) {
4        int n = nums.length;
5
6        if(n==1) return nums[0];
7
8        int prev2 = nums[0] , prev1 = Math.max(nums[0] , nums[1]);
9        for(int i = 2;i<n ; i++){
10                int pick = nums[i] + prev2;
11                int notpick = 0 + prev1;
12
13                int cur = Math.max(pick , notpick);
14                prev2 = prev1;
15                prev1 = cur;
16        }
17    return prev1;
18    }
19}