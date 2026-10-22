// Last updated: 22/10/2026, 12:07:59
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
13        boolean[] dp = new boolean [target + 1];
14
15        for (int i = 0; i < n; i++) {
16            dp[0] = true;
17        }
18
19        if (nums[0] <= target) {
20            dp[nums[0]] = true;
21        }
22
23        for (int i = 1; i < n; i++) {
24             boolean[] cur = new boolean [target + 1];
25             cur[0] = true;
26             for (int t = 0; t <= target; t++) {
27
28                boolean nottake = dp[t];
29                boolean take = false;
30                if (nums[i] <= t) {
31                    take = dp[t - nums[i]];
32                }
33
34                cur[t] = take || nottake;
35            }
36            dp=cur;
37        }
38        return dp[target];
39
40    }
41}