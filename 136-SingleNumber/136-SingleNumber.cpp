// Last updated: 28/06/2026, 01:04:19
class Solution {
public:
    int singleNumber(vector<int>& nums) {
        int res=nums[0];
        for(int i=1;i<=nums.size()-1;i++)
        {
            res ^=nums[i];
        }
        return res;
    }
};