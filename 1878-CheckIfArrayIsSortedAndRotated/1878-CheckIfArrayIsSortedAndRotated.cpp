// Last updated: 28/06/2026, 01:02:04
class Solution {
public:
    bool check(vector<int>& nums) {
       int count=0;
        int n=nums.size();
        
        for(int i=0;i<nums.size();i++){
            if(nums[i]>nums[(i+1)%n])count++;
        }
        
        return count<=1;
    }
};