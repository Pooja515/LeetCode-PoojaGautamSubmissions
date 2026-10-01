// Last updated: 01/10/2026, 17:17:50
1class Solution {
2    public int[] searchRange(int[] nums, int target) {
3        int first =-1,last=-1;
4        boolean flag = true;
5        first = f(nums,target, true);
6        if(first == -1) return new int[] {first,-1};
7        last = f(nums,target,false);
8
9        return new int[] {first,last};
10    }
11
12    int f(int[] nums,int target, boolean flag){
13        int n=nums.length;
14        int low =0 , high =n-1 ,ans = -1;
15
16        while(low<=high){
17            int mid = low+(high-low)/2;
18
19            if(flag){
20                if(nums[mid] == target){
21                    ans=mid;
22                    high =mid-1;
23
24                }
25                else if(nums[mid]>target) high=mid-1;
26                else{
27                    low =mid+1;
28                }
29            }
30            else{
31                 if(nums[mid] == target){
32                    ans=mid;
33                    low=mid+1;
34
35                }
36                  else if(nums[mid]<target) low=mid+1;
37                else{
38                    high=mid-1;
39                }
40            }
41        }
42        return ans;
43    }
44}