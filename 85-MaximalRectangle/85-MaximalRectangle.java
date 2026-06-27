// Last updated: 28/06/2026, 01:04:42
class Solution {
    public int maximalRectangle(char[][] matrix) {
       int m=matrix.length,n=matrix[0].length;
       if(m==0) return 0;
       int maxarea=0;
       int[] heights=new int[n];
       for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(matrix[i][j]=='1') heights[j]+=1;
            else
                   heights[j]=0;
        }
        maxarea= Math.max(maxarea,largestRectangleArea(heights));
       }
       return maxarea;
    }
    int largestRectangleArea(int[]heights){
    Deque<Integer> stack=new ArrayDeque<>();
    int n=heights.length, area=0;
    for(int i=0;i<=n;i++){
        int h=(i==n)?0:heights[i];
        while(!stack.isEmpty() && heights[stack.peek()]>h){
            int height=heights[stack.pop()];
            int width=stack.isEmpty()?i:i-stack.peek()-1;
            area=Math.max(area,height*width);
        }
        stack.push(i);
    }
    return area;
}
}