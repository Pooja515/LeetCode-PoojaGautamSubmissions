// Last updated: 23/08/2026, 08:34:53
1class Solution {
2    public List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper) {
3         List<List<Integer>> ans= new ArrayList<>();
4        Arrays.sort(nums);
5        long prev =(long) lower-1;
6        for(int num:nums){
7            if(num < lower) continue;
8            if(num>upper) break;
9            
10            if(num > prev+1){
11                ans.add(Arrays.asList((int)(prev+1),num-1));
12                
13            }
14            prev=num;
15            
16           
17        }
18         if(prev < upper){
19                ans.add(Arrays.asList((int)(prev+1),upper)); 
20            }
21        return ans;
22    }
23}