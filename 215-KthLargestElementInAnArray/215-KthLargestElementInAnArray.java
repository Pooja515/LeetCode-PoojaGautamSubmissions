// Last updated: 28/06/2026, 01:03:39
class Solution {
    public int findKthLargest(int[] nums, int k) {
       PriorityQueue<Integer> pq= new PriorityQueue<>();
       for(int n:nums){
          pq.add(n);
          if(pq.size()>k)
               pq.poll();
       }  
       return pq.peek();
    }
}