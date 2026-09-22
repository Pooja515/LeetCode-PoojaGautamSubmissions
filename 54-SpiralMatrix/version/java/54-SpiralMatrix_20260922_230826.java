// Last updated: 22/09/2026, 23:08:26
1class Solution {
2    public List<Integer> spiralOrder(int[][] matrix) {
3        List<Integer> ans = new ArrayList<>();
4        int n = matrix.length, m = matrix[0].length;
5        int left = 0, right = m - 1;
6        int top = 0, bottom = n - 1;
7        while (top <= bottom && left <= right) {
8            // left to right
9            for (int i = left; i <= right; i++) {
10                ans.add(matrix[top][i]);
11            }
12            top++;
13            //top to bottom 
14            for (int i = top; i <= bottom; i++) {
15                ans.add(matrix[i][right]);
16            }
17            right--;
18            //right to left
19            if (top <= bottom) {
20                for (int i = right; i >= left; i--) {
21                    ans.add(matrix[bottom][i]);
22                }
23                bottom--;
24            }
25            //bottom to top
26            if (left <= right) {
27                for (int i = bottom; i >= top; i--) {
28                    ans.add(matrix[i][left]);
29                }
30                left++;
31            }
32        }
33        return ans;
34    }
35}