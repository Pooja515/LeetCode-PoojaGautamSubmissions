// Last updated: 10/10/2026, 20:54:38
1class Solution {
2    public int[] maxProductPair(int[] nums, int target) {
3        long maxiproduct = Long.MIN_VALUE;
4        int curri = -1, currj = -1;
5        
6        HashMap<Integer, Integer> map = new HashMap<>();
7        
8        for (int j = 0; j < nums.length; j++) {
9            int complement = target - nums[j];
10            
11            if (map.containsKey(complement)) {
12                int i = map.get(complement); 
13                
14                int potentialI = -1;
15                int potentialJ = -1;
16                
17                if (nums[i] > nums[j]) {
18                    potentialI = i;
19                    potentialJ = j;
20                } else if (nums[j] > nums[i]) {
21                    potentialI = j;
22                    potentialJ = i;
23                }
24                
25                if (potentialI != -1) {
26                    long currproduct = (long) nums[potentialI] * nums[potentialJ];
27                    if (currproduct > maxiproduct) {
28                        maxiproduct = currproduct;
29                        curri = potentialI;
30                        currj = potentialJ;
31                    }
32                }
33            }
34            
35            map.put(nums[j], j);
36        }
37        
38        return new int[] { curri, currj };
39    }
40}