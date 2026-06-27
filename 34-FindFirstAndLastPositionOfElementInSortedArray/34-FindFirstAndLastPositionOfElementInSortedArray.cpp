// Last updated: 28/06/2026, 01:05:23
class Solution {
public:
int firstOccurance(vector<int> nums, int target){
    int low = 0,high=nums.size()-1;
    int mid ;
    int ans = -1;
    while(low<=high){
        mid = low + (high-low)/2;
        if(nums[mid] == target)
        {
            ans = mid;
            high = mid-1;//first occurrence
        }
        else if(nums[mid] > target)
            high = mid-1;
        
        else
            low = mid+1;
        
   //mid=low+(high-low)/2;    
    }
    return ans;
}

int lastOccurance(vector<int> nums, int target){
    int low = 0,high=nums.size()-1;
    int ans = -1;
    int mid;
    while(low<=high){
        mid = low + (high-low)/2;
        if(nums[mid] == target)
        {
            ans = mid;
            low = mid+1;//last occurrence
        }
        else if(nums[mid] > target)
            high = mid-1;
        
        else
            low = mid+1;
        
       
    }
    return ans;
}

vector<int> searchRange(vector<int>& nums, int target) 
{
    
    int a = firstOccurance(nums, target);
    int b = lastOccurance(nums, target);   
    
    vector<int> ans;
    ans.push_back(a);
    ans.push_back(b);
    
    return ans;
}
};