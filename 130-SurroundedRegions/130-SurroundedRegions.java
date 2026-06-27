// Last updated: 28/06/2026, 01:04:17
class Solution {
    int rows,cols;
    int[][] directions={{-1,0},{1,0},{0,-1},{0,1}};
    public void solve(char[][] board) {
      if(board==null || board.length==0) return;
      rows=board.length;cols=board[0].length;

      for(int row=0;row<rows;row++){
           if(board[row][0]=='O')
                   isvalid(board,row,0);
            if(board[row][cols-1]=='O')
                   isvalid(board,row,cols-1);

      }  

      for(int col=0;col<cols;col++){
            if(board[0][col]=='O')
                   isvalid(board,0,col);
            if(board[rows-1][col]=='O')
                   isvalid(board,rows-1,col);
      }

      for(int row=0;row<rows;row++){
        for(int col=0;col<cols;col++){
            if(board[row][col]=='O') board[row][col]='X';
            else if(board[row][col]=='S') board[row][col]='O';
        }
      }
    }
      
      void isvalid(char[][] board,int row,int col){
            board[row][col]='S';
            for(int[] dir:directions){
                int newr=row+dir[0],newc=col+dir[1];
                if(newr>=0 && newr<rows && newc>=0 && newc<cols && board[newr][newc]=='O'){
                      isvalid(board,newr,newc);
                }

            }
    }
}