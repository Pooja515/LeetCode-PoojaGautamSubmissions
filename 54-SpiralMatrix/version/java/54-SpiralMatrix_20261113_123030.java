// Last updated: 13/11/2026, 12:30:30
1class Solution {
2    public List<Integer> spiralOrder(int[][] matrix) {
3        List<Integer> ans = new ArrayList<>();
4        if (matrix == null || matrix.length == 0) return ans;
5       // int n = matrix.length, m = matrix[0].length;
6      //  int top = 0, bottom = n - 1, left = 0, right = m - 1;
7      int top = 0, bottom = matrix.length - 1;
8        int left = 0, right = matrix[0].length - 1;
9
10        while (top <= bottom && left <= right) {
11            // explore left to right
12            for (int i = left; i <= right; i++) {
13                ans.add(matrix[top][i]);
14            }
15            top++;
16            // top to bottom
17            for (int i = top; i <= bottom; i++) {
18                ans.add(matrix[i][right]);
19            }
20            right--;
21            //right to left
22            if(top <= bottom) {
23                for (int i = right; i >= left; i--) {
24                    ans.add(matrix[bottom][i]);
25                }
26                bottom--;
27            }
28            //bottom to top
29            if (left <= right) {
30                for (int i = bottom; i >= top; i--) {
31                    ans.add(matrix[i][left]);
32                }
33                left++;
34            }
35
36        }
37        return ans;
38    }
39}