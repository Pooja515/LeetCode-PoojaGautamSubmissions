// Last updated: 24/10/2026, 20:03:13
1class Solution {
2    public int peakValleyDifference(int[] nums) {
3        int peakSum = 0;
4        int valleySum = 0;
5        int n = nums.length;
6        
7      
8        for (int i = 1; i < n - 1; i++) {
9            if (nums[i] > nums[i - 1] && nums[i] > nums[i + 1]) {
10                peakSum += nums[i];
11            } else if (nums[i] < nums[i - 1] && nums[i] < nums[i + 1]) {
12                valleySum += nums[i];
13            }
14        }
15        
16        return peakSum - valleySum;
17    }
18}
19