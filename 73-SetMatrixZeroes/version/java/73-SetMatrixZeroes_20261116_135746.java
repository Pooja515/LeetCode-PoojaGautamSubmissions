// Last updated: 16/11/2026, 13:57:46
1class Solution {
2    public void setZeroes(int[][] matrix) {
3        int m = matrix.length , n = matrix[0].length;
4
5        boolean rowflag = false , colflag = false;
6        //explore row 
7        for(int i=0;i<m;i++){
8            if(matrix[i][0] == 0){
9               colflag = true;
10               break;
11            }
12        }
13
14        // explore col
15         for(int i=0;i<n;i++){
16            if(matrix[0][i] == 0){
17               rowflag = true;
18               break;
19            }
20           
21        }
22
23        for(int i=1;i<m;i++){
24            for(int j=1;j<n;j++){
25                if(matrix[i][j] == 0){
26                     matrix[0][j] = 0;
27                     matrix[i][0] = 0;
28                }
29
30            }
31        }
32
33         for(int i=1;i<m;i++){
34            for(int j=1;j<n;j++){
35                if(matrix[0][j] == 0 || matrix[i][0] == 0){
36                     matrix[i][j] = 0;
37                
38                }
39
40            }
41        }
42
43        if(rowflag){
44            for(int i=0;i<n;i++){
45                matrix[0][i]=0;
46            }
47        }
48
49        if(colflag){
50            for(int i=0;i<m;i++){
51                matrix[i][0]=0;
52            }
53        }
54    }
55}