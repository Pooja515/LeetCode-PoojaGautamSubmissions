// Last updated: 14/08/2026, 18:18:14
1class Solution {
2    public int findMaxLength(int[] nums) {
3        HashMap<Integer,Integer> map = new HashMap<>();
4        map.put(0,-1);
5        int sum=0 , maxlen=0;
6
7        for(int i=0;i<nums.length;i++){
8            if(nums[i]==0){
9                int num = -1;
10                sum += num;
11            }
12            else
13                 sum += nums[i];
14            
15            if(map.containsKey(sum)){
16                maxlen = Math.max(maxlen ,i - map.get(sum));
17            }
18            else
19             
20                   map.put(sum,i);
21        }
22        return maxlen;
23    }
24}