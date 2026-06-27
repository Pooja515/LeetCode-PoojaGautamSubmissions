// Last updated: 28/06/2026, 01:05:33
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int i=0,n=nums.length;
        int ans=nums[0]+nums[1]+nums[2];
        while(i<n){
            int j=i+1,k=n-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum==target) return sum;
                if (Math.abs(sum - target) <Math.abs(ans - target)) {
                    ans = sum;
                }
                else if(sum<target)
                             j++;
                else 
                         k--;
            }
            i++;
        }
        return ans;
    }
}