// Last updated: 22/10/2026, 11:48:29
1class Solution {
2    public boolean canPartition(int[] nums) {
3        int n = nums.length;
4        int sum = 0;
5        for (int i = 0; i < n; i++) {
6            sum += nums[i];
7        }
8
9        if (sum % 2 != 0)
10            return false;
11        int target = sum / 2;
12
13        int[][] memo = new int[n][target + 1];
14        for (int[] rows : memo) {
15            Arrays.fill(rows, -1);
16        }
17
18        return f(n - 1, target, nums, memo);
19    }
20
21    boolean f(int i, int target, int[] nums, int[][] memo) {
22        if (target == 0)
23            return true;
24
25        if (i == 0)
26            return nums[0] == target;
27
28        if (memo[i][target] != -1)
29            return memo[i][target] == 1;
30
31        boolean nottake = f(i - 1, target, nums, memo);
32        boolean take = false;
33        if (nums[i] <= target) {
34            take = f(i - 1, target - nums[i], nums, memo);
35        }
36
37        memo[i][target] = take || nottake ? 1 : 0;
38
39        return take || nottake;
40
41    }
42}