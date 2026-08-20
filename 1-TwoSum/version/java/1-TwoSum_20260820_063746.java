// Last updated: 20/08/2026, 06:37:46
1class Solution {
2    public int countPairs(List<Integer> nums, int target) {
3        int cnt =0;
4        for(int i=0; i<nums.size()-1; i++){
5            for(int j=i+1; j<nums.size(); j++){
6                if(nums.get(i) + nums.get(j) < target ) {
7                    cnt++;
8                }
9            }
10        }
11        return cnt;
12    }
13}