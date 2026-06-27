// Last updated: 28/06/2026, 01:04:53
class Solution {
    public void setZeroes(int[][] matrix) {

       int m = matrix.length ;
       int n = matrix[0].length;

       boolean rmatrix = false;
       boolean cmatrix = false;

       for(int i=0;i<m;i++){
                if(matrix[i][0] == 0){
                   cmatrix = true;
                   break;
                }
                        
        }
        for(int i=0;i<n;i++){
                if(matrix[0][i] == 0){
                    rmatrix = true;
                    break;
                }
        }


       for(int i=1;i<m;i++){
           for(int j=1;j<n;j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] =0;
                    matrix[0][j] =0;
                }
            }
        }

         for(int i=1;i<m;i++){
           for(int j=1;j<n;j++){
                if(matrix[i][0] == 0 || matrix[0][j] ==0){
                   
                    matrix[i][j] =0;
                }
            }
        }

        if(rmatrix){
            for(int i=0;i<n;i++){
                matrix[0][i] =0;
            }
        }
       if(cmatrix){
          for(int j=0;j<m;j++){
              matrix[j][0] = 0;
          }
       }
       
    }
}