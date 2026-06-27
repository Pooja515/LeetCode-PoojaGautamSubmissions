// Last updated: 28/06/2026, 01:04:01
class Solution {
public:
    void reverse1(vector<int> & nums,int s,int e){
        while(s<=e)
        {
            int temp=nums[s];
            nums[s]=nums[e];
            nums[e]=temp;
            s++;
            e--;
        }
    }
    void rotate(vector<int>& nums, int k) {
        int n=nums.size();
         k = k%n;
        if(n==0 )
            return;
       
        reverse1(nums,n-k,n-1);
        reverse1(nums,0,n-k-1);
        reverse1(nums,0,n-1);
    }
};