// Last updated: 16/10/2026, 00:48:35
1class Solution {
2
3    public int rob(int[] nums) {
4        int n = nums.length;
5        if (n == 1)
6            return nums[0];
7        int[] memo1 = new int[n];
8        Arrays.fill(memo1,-1);
9
10        int[] memo2 = new int[n];
11        Arrays.fill(memo2,-1);
12
13
14        int excludeLast = f(n - 2, 0, nums,memo1);
15
16        int excludeFirst = f(n - 1, 1, nums,memo2);
17
18        return Math.max(excludeLast, excludeFirst);
19    }
20
21    int f(int i, int start, int[] nums , int[] memo) {
22        if (i < start)
23            return 0;
24        if (i == start)
25            return nums[start];
26        if(memo[i] != -1) return memo[i];
27
28        int pick = nums[i] + f(i - 2, start, nums,memo);
29        int notPick = f(i - 1, start, nums,memo);
30
31        return memo[i] = Math.max(pick, notPick);
32    }
33}