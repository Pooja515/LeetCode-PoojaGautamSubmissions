// Last updated: 30/06/2026, 09:13:54
/*
 * Approach : Using reversal algorithm to rotate an array k times towards right.
 * Time Complexity : O(N)  // First pass to reverse entire array , next pass to reverse till k elements i.e O(K) ,then reverse next k to n-1 i.e O(N-K) TIMES
 * Space Complexity : O(1)
*/

1class Solution {
2    public void rotate(int[] nums, int k) {
3        int n = nums.length;
4        k = k % n;
5        rotate(nums , 0 , n-1);
6        rotate(nums , 0 , k-1);
7        rotate(nums , k , n-1);
8    }
9    void rotate(int[] nums , int s ,int e){
10        while(s<e){
11            int temp = nums[s];
12            nums[s] = nums[e];
13            nums[e] = temp;
14            s++;
15            e--;
16        }
17    }
18}