// Last updated: 16/10/2026, 00:47:41
1class Solution {
2
3    public int rob(int[] nums) {
4        int n = nums.length;
5        if (n == 1)
6            return nums[0];
7        int[] memo1 = new int[n];
8        Arrays.fill(memo1 , -1);
9        int[] memo2 = new int[n] ; 
10        Arrays.fill(memo2 , -1);
11
12        int excludeLast = f(n - 2, 0, nums ,memo1 );
13
14        int excludeFirst = f(n - 1, 1, nums , memo2);
15
16        return Math.max(excludeLast, excludeFirst);
17    }
18
19    int f(int i, int start, int[] nums, int[] memo) {
20        if (i < start)
21            return 0;
22        if (i == start)
23            return nums[start];
24        if(memo[i] != -1) return memo[i];
25
26        int pick = nums[i] + f(i - 2, start, nums , memo);
27        int notPick = f(i - 1, start, nums , memo);
28
29        return memo[i] = Math.max(pick, notPick);
30    }
31}