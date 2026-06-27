// Last updated: 28/06/2026, 01:05:12
class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int l=0,r=0,sum=0;
        int maxi=INT_MIN;
        while(l<nums.size())
        {
        while(r<nums.size())
        {
            sum+=nums[r++];
            maxi=max(maxi,sum);
            if(sum<0)
                sum=0;
        }
    
        sum-=nums[l++];
        }
    return maxi;
    }
};