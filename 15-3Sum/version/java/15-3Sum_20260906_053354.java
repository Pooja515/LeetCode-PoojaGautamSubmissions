// Last updated: 06/09/2026, 05:33:54
1class Solution {
2    public List<List<Integer>> threeSum(int[] nums) {
3        List<List<Integer>> ans = new ArrayList<>();
4        int n = nums.length;
5        Arrays.sort(nums);
6
7        for (int i = 0; i < n - 2; i++) {
8            if (i != 0 && nums[i] == nums[i - 1])
9                continue;
10            int j = i + 1 , k = n - 1;
11            while (j < k) {
12                int sum = nums[i] + nums[j] + nums[k];
13                if (sum < 0)
14                    j++;
15                else if (sum > 0)
16                    k--;
17                else {
18                    ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
19                    j++;
20                    k--;
21                    while (j < k && nums[j] == nums[j - 1])
22                        j++;
23                    while (j < k && nums[k] == nums[k + 1])
24                        k--;
25                }
26            }
27        }
28
29        return ans;
30    }
31}