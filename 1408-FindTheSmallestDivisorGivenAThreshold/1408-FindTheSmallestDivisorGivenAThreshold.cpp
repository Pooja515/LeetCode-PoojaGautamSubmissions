// Last updated: 28/06/2026, 01:02:11
class Solution {
public:
    int findsumafterdiv(vector<int> nums,int div)
    {
        int sum=0;
        for(int i=0;i<nums.size();i++)
        {
            sum+=(nums[i]/div);
            if(nums[i]%div !=0)
            {
                sum+=1;
            }
            
        }
        return sum;
    }
    int smallestDivisor(vector<int>& nums, int threshold) {
        int low=1;
        int mid;
        int high=*max_element(nums.begin(),nums.end()); 
        int ans=high;
        while(low<=high)
        {
            mid=low+(high-low)/2;
            if(findsumafterdiv(nums,mid)<=threshold)
            {
                ans=mid;
                high=mid-1;
                
            }
            else
                low=mid+1;
        }
        return ans;
    }
};