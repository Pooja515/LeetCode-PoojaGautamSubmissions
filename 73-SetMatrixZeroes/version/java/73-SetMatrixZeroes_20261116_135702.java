// Last updated: 16/11/2026, 13:57:02
1class Solution {
2    public void setZeroes(int[][] matrix) {
3        int m= matrix.length, n= matrix[0].length;
4
5        boolean rowflag= false , colflag =false;
6
7        for(int r=0;r<m;r++){
8            if(matrix[r][0] == 0 ) {
9                colflag =true;
10                break;
11            }
12        }
13        for(int c=0;c<n;c++){
14            if(matrix[0][c] == 0) {
15                rowflag =true;
16                break;
17            }
18        }
19        for(int r=1;r<m;r++){
20            for(int c=1;c<n;c++){
21                if(matrix[r][c] == 0){
22                    matrix[0][c] = 0;
23                    matrix[r][0] = 0;
24                }
25            }
26        }
27
28        for(int r=1;r<m;r++){
29            for(int c=1;c<n;c++){
30                if(matrix[0][c] ==0 || matrix[r][0] ==0){
31                    matrix[r][c] =0;
32                }
33            }
34        }
35
36        if(rowflag){
37            for(int c=0;c<n;c++){
38                matrix[0][c] =0;
39            }
40        }
41         if(colflag){
42            for(int r=0;r<m;r++){
43                matrix[r][0] =0;
44            }
45        }
46    }
47}