// Last updated: 28/06/2026, 01:03:16
class Solution {
public:
    bool numerofarraylimit(vector<int>& nums,int limit,int m)
    {
        int count=1;
        int n=nums.size();
        int sum=0;
        for(int i=0;i<n;i++)
        {
           if(nums[i]>limit)
            return false;
            if(nums[i]+sum>limit)
            {
                count++;
                sum=nums[i];
            }
            else
                sum+=nums[i];
        }
        return count<=m;
    }
    int splitArray(vector<int>& nums, int m) {
     int low=*max_element(nums.begin(),nums.end());  
        int high=0,mid;
        int n=nums.size();
        for(int i=0;i<n;i++)
            high+=nums[i];
        int ans=high;
        while(low<=high)
        {
           mid=low+(high-low)/2;
            if(numerofarraylimit(nums,mid,m)==false)
            {
                low=mid+1;
            }
            else
            {
                ans=mid;
                high=mid-1;
            }
        }
        return ans;
    }
};