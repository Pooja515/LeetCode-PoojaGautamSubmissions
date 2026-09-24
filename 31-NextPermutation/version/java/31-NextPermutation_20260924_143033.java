// Last updated: 24/09/2026, 14:30:33
1class Solution {
2    public void nextPermutation(int[] nums) {
3        int n = nums.length;
4        int point = -1;
5        for(int i=n-2;i>=0;i--){
6            if(nums[i] <nums[i+1]){
7                point =i;
8                break;
9            }
10        }
11        if(point == -1){
12            reverse(0,n-1,nums);
13            return;
14        }
15
16        for(int i=n-1;i>point;i--){
17            if(nums[i] > nums[point]){
18               int temp=nums[i];
19                nums[i]=nums[point];
20                nums[point]=temp;
21                break;
22            }
23        }
24
25        reverse(point+1,n-1,nums);
26        }
27      void reverse(int l,int r,int[] nums){
28            while(l<r){
29            int temp=nums[l];
30            nums[l]=nums[r];
31            nums[r]=temp;
32            l++;
33            r--;
34        }
35        
36    }
37}