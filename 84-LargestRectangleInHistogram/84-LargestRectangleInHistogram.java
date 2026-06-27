// Last updated: 28/06/2026, 01:04:43
class Solution {
    public int largestRectangleArea(int[] heights) {
        Deque<Integer> stack =new ArrayDeque<>();
        int maxarea=0,n=heights.length;
        for(int i=0;i<=n;i++){
            int h=(i==n)?0:heights[i];
            while(!stack.isEmpty() && heights[stack.peek()]>h){
                int height=heights[stack.pop()];
                int width=stack.isEmpty()?i:i-stack.peek()-1;
                maxarea=Math.max(maxarea,height*width);

            }
            stack.push(i);
        }
        return maxarea;
    }
}