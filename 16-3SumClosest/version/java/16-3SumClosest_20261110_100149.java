// Last updated: 10/11/2026, 10:01:49
1class Solution {
2    public int threeSumClosest(int[] nums, int target) {
3        int n = nums.length;
4        Arrays.sort(nums);
5        int ans = nums[0]+nums[1]+nums[2];
6        int i=0;
7        while(i<n){
8            int j=i+1,k=n-1;
9            while(j<k){
10            int sum = nums[i]+nums[j]+nums[k];
11            if(sum == target) return sum;
12            if(Math.abs(sum-target)<Math.abs(ans-target)){
13                ans=sum;
14            }
15            if(sum<target) j++;
16            if(sum>target) k--;
17        }
18        i++;
19        }
20        return ans;
21
22    }
23}