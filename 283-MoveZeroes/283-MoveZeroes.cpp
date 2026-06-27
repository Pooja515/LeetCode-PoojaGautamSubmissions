// Last updated: 28/06/2026, 01:03:30
class Solution {
public:
    void moveZeroes(vector<int>& nums) {
        int k=0;
        int n=nums.size();
    while(k<n)
    {
         if(nums[k] ==0)
           break;
        else
            k++;
      }
   int i=k,j=k+1;
        while(i<n && j<n)
        {
            if(nums[j]!=0)
            {
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
            }
            j++;
        }
        for(i=0;i<n;i++)
            cout<<nums[i];
    }
    
};