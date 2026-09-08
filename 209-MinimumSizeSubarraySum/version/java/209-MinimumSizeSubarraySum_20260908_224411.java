// Last updated: 08/09/2026, 22:44:11
1class Solution {
2    public int findDuplicate(int[] nums) {
3       int  slow = nums[0], fast = nums[nums[0]];
4        while(slow != fast){
5            slow = nums[slow] ;
6            fast = nums[nums[fast]];
7        }
8        slow = 0;
9        while(slow != fast){
10           slow = nums[slow];
11           fast = nums[fast]; 
12        }
13        return slow;
14    }
15}