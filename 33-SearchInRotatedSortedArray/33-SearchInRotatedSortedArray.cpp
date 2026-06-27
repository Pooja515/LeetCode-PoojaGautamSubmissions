// Last updated: 28/06/2026, 01:05:25
class Solution {
public:
    int search(vector<int>& nums, int target) {
        int low=0,high=nums.size()-1;
        int mid;
        while(low<=high)
        {
            mid=low+(high-low)/2;
            if(nums[mid]==target)
                  return mid;
            if(nums[low]<=nums[mid]) //left portion sorted
            {
                if(target>=nums[low] && target<=nums[mid])
                    high=mid-1;
                 else
                     low=mid+1;
            }
            else
                // right portion is sorted
            {
                if(target>=nums[mid] && target<=nums[high])
                    low=mid+1;
                else
                    high=mid-1;
            }
            
        }
return -1;
    }

};