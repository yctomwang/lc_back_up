/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 57.56 %
    Runtime : 8 ms
    Memory Usage : 48 MB
    Testcase : 33 / 33 passed
    Ranking : 
        Your runtime beats 52.93 % of java submissions.
        Your memory usage beats 39.60 % of java submissions.
}
*/

class TicTacToe {
    int[] rows;
    int[] cols;
    int diag =0;
    int anti_diag = 0;
    
    public TicTacToe(int n) {
        rows = new int[n];
        cols = new int[n];
    }
    
    public int move(int row, int col, int player) {
        if(player==1){
            cols[col]+=1;
            rows[row]+=1;
            if(row==col){
                diag++;
            }
            if(row+col==rows.length-1)
            {
                anti_diag++;
            }
            if(cols[col]==rows.length) return player;
            if(rows[row]==rows.length) return player;
            if(diag==rows.length) return player;
            if(anti_diag==rows.length) return player;
            
        }else{
            
            cols[col]-=1;
            rows[row]-=1;
            if(row==col){
                diag--;
            }
            if(row+col==rows.length-1)
            {
                anti_diag--;
            }
            if(cols[col]==-rows.length) return player;
            if(rows[row]==-rows.length) return player;
            if(diag==-rows.length) return player;
            if(anti_diag==-rows.length) return player;
            
        }
        return 0;
    }
}

/**
 * Your TicTacToe object will be instantiated and called as such:
 * TicTacToe obj = new TicTacToe(n);
 * int param_1 = obj.move(row,col,player);
 */