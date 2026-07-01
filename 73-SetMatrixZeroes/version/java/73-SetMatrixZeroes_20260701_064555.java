// Last updated: 01/07/2026, 06:45:55
1class Solution {
2    public void setZeroes(int[][] matrix) {
3        boolean rowflag = false , colflag = false; 
4        int m = matrix.length , n = matrix[0].length;
5//explore 0 column , (if column 0 has a zero)
6        for(int i =0 ; i<m;i++){
7            if(matrix[i][0] == 0){
8                colflag = true;
9                break;
10            }
11        }
12// explore 0 row , (if row 0 has a zero)
13        for(int i =0 ; i<n;i++){
14            if(matrix[0][i] == 0){
15                rowflag = true;
16                break;
17            }
18        }
19
20        for(int i=1;i<m;i++){
21            for(int j=1 ; j<n; j++){
22                if(matrix[i][j] == 0){
23                    matrix[i][0] =0;
24                    matrix[0][j] =0;
25    
26                }
27            }
28        }
29
30        for(int i=1;i<m;i++){
31            for(int j=1 ; j<n; j++){
32                if( matrix[i][0] ==0 || matrix[0][j] ==0){
33                    matrix[i][j] =0;
34                }
35            }
36        }
37// if row 0 has 0 , make entire row 0 to 0
38        if(rowflag){
39            for(int i =0 ; i<n ;i++){
40                matrix[0][i] =0;
41            
42            }
43        }
44// if col 0 has 0 , make entire col 0 to 0
45         if(colflag){
46            for(int i =0 ; i<m ;i++){
47                matrix[i][0] =0;
48            
49            }
50        }
51    }
52}
53