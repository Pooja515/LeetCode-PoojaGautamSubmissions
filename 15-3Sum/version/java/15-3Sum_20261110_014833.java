// Last updated: 10/11/2026, 01:48:33
1class Solution {
2    public List<List<Integer>> threeSum(int[] nums) {
3        List<List<Integer>> ans = new ArrayList<>();
4        int n=nums.length;
5        Arrays.sort(nums);
6
7        for(int i=0;i<n-2;i++){
8            if(i>0 && nums[i] == nums[i-1]) continue;
9            int j=i+1,k=n-1;
10
11            while(j<k){
12                int sum = nums[i]+nums[j]+nums[k];
13                if(sum < 0) j++;
14                else if(sum > 0) k--;
15                else{
16                    ans.add(Arrays.asList(nums[i],nums[j],nums[k]));
17                    j++;
18                    k--;
19                    while(j<k && nums[j] == nums[j-1]) j++;
20                    while(j<k && nums[k] == nums[k+1]) k--;
21                }
22                
23            }
24        }
25        return ans;
26    }
27}