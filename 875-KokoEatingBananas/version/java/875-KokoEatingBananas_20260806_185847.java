// Last updated: 06/08/2026, 18:58:47
1class Solution {
2    public int splitArray(int[] nums, int k) {
3        int low=0,high=0;
4        for(int i=0;i<nums.length;i++){
5            low=Math.max(low,nums[i]);
6            high+=nums[i];
7        }
8      
9        while(low<=high){
10            int mid=low+(high-low)/2;
11            if(isvalid(nums,mid,k)){
12            
13               high=mid-1;
14            }
15            else
16                    low=mid+1;
17        }
18        return low;
19    }
20    boolean isvalid(int[] nums,int mid,int k){
21          int cnt=1,sum=0;
22          for(int i=0;i<nums.length;i++){
23            sum+=nums[i];
24            if(sum>mid){
25                sum=nums[i];
26                cnt++;
27            }
28          }
29          if(cnt<=k)
30               return true;
31     return false;
32    }
33}