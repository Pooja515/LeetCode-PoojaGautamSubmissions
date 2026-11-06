// Last updated: 07/11/2026, 00:31:57
1class Solution {
2    public void rotate(int[][] matrix) {
3        if(matrix == null ) return ;
4        int n = matrix.length;
5        for(int i=0;i<n;i++){
6            for(int j=i+1;j<n;j++){
7                int temp = matrix[i][j];
8                matrix[i][j] = matrix[j][i];
9                matrix[j][i] = temp;
10
11            }
12        }
13        for(int i=0;i<n;i++){
14            int low = 0,high = matrix[0].length-1;
15            while(low<high){
16                int temp = matrix[i][low];
17                matrix[i][low]=matrix[i][high];
18                matrix[i][high] =temp;
19                low++;
20                high--;
21            }
22
23        }
24
25    }
26}