// Last updated: 19/11/2026, 17:26:34
1class Solution {
2    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
3        Map<Integer,Integer> map = new HashMap<>();
4        Deque<Integer> stack = new ArrayDeque<>();
5
6        for(int num : nums2){
7            while(!stack.isEmpty() && num > stack.peek()){
8                map.put(stack.pop(),num);
9            }
10            stack.push(num);
11        }
12        while(!stack.isEmpty()){
13            map.put(stack.pop(),-1);
14        }
15        int[] res = new int[nums1.length];
16        for(int i=0;i<nums1.length;i++){
17            res[i] = map.get(nums1[i]);
18        }
19        return res;
20    }
21}