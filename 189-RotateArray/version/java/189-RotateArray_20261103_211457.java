// Last updated: 03/11/2026, 21:14:57
1class Solution {
2    public void rotate(int[] nums, int k) {
3       int n= nums.length;
4       k=k%n;
5       rotate(0,n-1,nums,k);
6       rotate(0,k-1,nums,k);
7       rotate(k,n-1,nums,k); 
8    }
9    void rotate(int i ,int j ,int[] nums,int k){
10        while(i<j){
11            int temp = nums[i];
12            nums[i] = nums[j];
13            nums[j] = temp;
14            i++;
15            j--;
16        }
17    }
18}