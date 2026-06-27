// Last updated: 28/06/2026, 01:05:05
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
          List<Integer> ans = new ArrayList();
            int n = matrix.length;
            int m = matrix[0].length;
          
            int left = 0,right = m - 1,top = 0,bottom = n - 1;

          
           while (ans.size() < n * m) {
            // Traverse top row
            for (int i = left; i <= right; i++) {
                ans.add(matrix[top][i]);
            }
            top++;

            // Traverse right column
            for (int i = top; i <= bottom; i++) {
                ans.add(matrix[i][right]);
            }
            right--;

            // Check if there are remaining rows and traverse bottom row
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            }

            // Check if there are remaining columns and traverse left column
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }
        return ans;
        }
    }

