// Last updated: 14/08/2026, 20:56:37
1class Solution {
2    public int findMaxLength(int[] nums) {
3        HashMap<Integer,Integer> map = new HashMap<>();
4        map.put(0,-1);
5        int sum=0 , maxlen=0;
6
7        for(int i=0;i<nums.length;i++){
8            sum += (nums[i] == 0) ? -1:1;
9            
10            if(map.containsKey(sum)){
11                maxlen = Math.max(maxlen ,i - map.get(sum));
12            }
13            else
14             
15                   map.put(sum,i);
16        }
17        return maxlen;
18    }
19}