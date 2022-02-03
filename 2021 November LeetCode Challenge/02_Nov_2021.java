class Solution {
    public void solve(char[][] board) {
        boolean[][] arr=new boolean[board.length][board[0].length];
        for(int i=0;i<board.length;i++){
           if(board[i][0]=='O'){
              mark(i,0,arr,board);  
           }
            
           if(board[i][board[0].length-1]=='O'){
               mark(i,board[0].length-1,arr,board);
           } 
            
        }
        for(int i=1;i<board[0].length-1;i++){
           if(board[0][i]=='O'){
              mark(0,i,arr,board);  
           }
            
           if(board[board.length-1][i]=='O'){
               mark(board.length-1,i,arr,board);
           } 
        }
        
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='O'&&!arr[i][j]){
                    board[i][j]='X';
                }
            }
        }
        
        
        
        
    }
    
    public void mark(int i,int j,boolean[][] arr,char[][] board){
        if(i<0||j<0||i>=board.length||j>=board[0].length||board[i][j]!='O'||arr[i][j]){
            return;
        }
        arr[i][j]=true;
        mark(i-1,j,arr,board);
        mark(i,j+1,arr,board);
        mark(i+1,j,arr,board);
        mark(i,j-1,arr,board);
        
    }
}