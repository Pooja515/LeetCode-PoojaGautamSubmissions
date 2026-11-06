// Last updated: 07/11/2026, 02:57:39
1class Solution {
2    public List<Integer> spiralOrder(int[][] matrix) {
3         List<Integer> ans = new ArrayList<>();
4         int m = matrix.length , n = matrix[0].length;
5         int left=0, right = n-1;
6         int top=0, bottom = m-1;
7
8         while(left <= right && top <= bottom){
9            //left to right
10            for(int i = left ;i <= right;i++){
11                ans.add(matrix[top][i]);
12            }
13            top++;
14            //top to bottom
15            for(int i=top;i <= bottom;i++){
16                ans.add(matrix[i][right]);
17            }
18            right--;
19            //right to left
20            if(top<=bottom){
21            for(int i=right;i>=left;i--){
22                ans.add(matrix[bottom][i]);
23            }
24            bottom--;
25         }
26         //bottom to top
27         if(left <= right){
28            for(int i=bottom;i>=top;i--){
29                ans.add(matrix[i][left]);
30            }
31         }
32            left++;
33         }
34         return ans;
35    }
36}