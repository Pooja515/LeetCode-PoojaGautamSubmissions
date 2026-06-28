// Last updated: 28/06/2026, 22:37:43
/*
 * Approach : Sorting followed by a fixed element and a two-pointer scan (Left/Right) to find pairs, with duplicate-skipping checks.
 * Time Complexity : O(n^2) 
 * Space Complexity : O(log n) due to the internal sorting mechanism (or O(1) if ignoring log n overhead)
*/

1class Solution {
2    public List<List<Integer>> threeSum(int[] nums) {
3        List<List<Integer>> ans = new ArrayList<>();
4        Arrays.sort(nums);
5        int n = nums.length;
6        for(int i = 0 ; i < n ; i++){
7            if(i != 0 && nums[i] == nums[i-1]) continue;
8            int j= i+1 , k = n-1;
9            while(j<k){
10                int sum = nums[i] + nums[j] + nums[k];
11                if(sum < 0){
12                    j++;
13                }
14                else if(sum > 0) k--;
15                else{
16                    ans.add(Arrays.asList(nums[i], nums[j] , nums[k]));
17                    j++;
18                    k--;
19                    while(j < k && nums[j] == nums[j-1]) j++;
20                    while(j < k && nums[k] == nums[k+1]) k--;
21                }
22            } 
23        }
24        return ans;
25    }
26}