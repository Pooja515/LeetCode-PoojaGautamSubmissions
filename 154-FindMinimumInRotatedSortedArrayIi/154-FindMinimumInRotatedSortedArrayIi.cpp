// Last updated: 28/06/2026, 01:04:07
class Solution {
public:
    int findMin(vector<int>& nums) {
        int low=0,high=nums.size()-1;
        int mid;
        while(low<high)
        {
            mid=low+(high-low)/2;
            if(nums[mid]<nums[high])
                high=mid;
            else if(nums[mid]>nums[high])
                low=mid+1;
            else 
                high--;
         }
      return nums[low];  
        
    }
};