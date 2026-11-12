// Last updated: 12/11/2026, 14:41:08
1class Solution {
2    public List<Integer> findDisappearedNumbers(int[] nums) {
3        List<Integer> ans = new ArrayList<>();
4        HashSet<Integer> set = new HashSet<>();
5        int n= nums.length;
6
7        for(int i=0;i<n;i++){
8            set.add(nums[i]);
9        }
10
11        for(int i=1;i<=n;i++){
12            if(!set.contains(i)){
13                ans.add(i);
14            }
15        }
16        return ans;
17    }
18}