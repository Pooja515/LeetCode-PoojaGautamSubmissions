// Last updated: 28/06/2026, 01:02:41
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
     Deque<Integer> st= new ArrayDeque<>();
     int n= temperatures.length;
     int[] ans = new int[n];
     for(int i=n-1;i>=0;i--){
        while(!st.isEmpty() && temperatures[st.peek()] <=temperatures[i]){
            st.pop();
         }
        if(!st.isEmpty())
            ans[i]=st.peek()-i;
        st.push(i);
     }   
     return ans;
    }
}