// Last updated: 07/11/2026, 05:23:15
1class Solution {
2    public int findDuplicate(int[] nums) {
3        int slow =nums[0];
4        int fast = nums[nums[0]];
5        while(slow != fast){
6            slow = nums[slow];
7            fast = nums[nums[fast]];
8        }
9        slow =0;
10        while(slow != fast){
11            slow = nums[slow];
12            fast = nums[fast];
13        }
14        return slow;
15       
16    }
17}