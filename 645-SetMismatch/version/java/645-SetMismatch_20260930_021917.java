// Last updated: 30/09/2026, 02:19:17
1class Solution {
2    public int[] findErrorNums(int[] nums) {
3       int n=nums.length;
4       int repeating =-1 ,missing=-1;
5       int[] ans = new int[n+1];
6
7       for(int num:nums){
8        ans[num]++;
9       }
10
11       for(int i=1;i<=n;i++){
12            if(ans[i]==2) repeating =i;
13            else if (ans[i]==0) missing =i;
14        } 
15
16       
17
18       return new int[] {repeating,missing};
19    }
20}