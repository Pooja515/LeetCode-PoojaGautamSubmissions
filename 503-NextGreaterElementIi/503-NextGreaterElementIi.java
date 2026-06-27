// Last updated: 28/06/2026, 01:03:03
class Solution {
    public int[] nextGreaterElements(int[] nums) {
       Deque<Integer> stack=new ArrayDeque<>();
       int n=nums.length;
       int[] ans=new int[n];
       Arrays.fill(ans,-1);
       for(int i=2*(n-1);i>=0;i--){
        while(!stack.isEmpty() && stack.peek()<=nums[i%n]) stack.pop();
          if(!stack.isEmpty() && i<n){
            ans[i]=stack.peek();
          }
          stack.push(nums[i%n]);
       } 
       return ans;
    }
}