/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 35.55 %
    Runtime : 7 ms
    Memory Usage : 51.3 MB
    Testcase : 58 / 58 passed
    Ranking : 
        Your runtime beats 23.38 % of java submissions.
        Your memory usage beats 74.96 % of java submissions.
}
*/

class Solution {
    int[][] direction={{1,0},{-1,0},{0,1},{0,-1}};
    public void solve(char[][] board) {
       //siml   
        //can translate the problem finding the patch of O's that are connected to the edge
        
       
        //perform BFS until something has reached edge
        //otherwise baclkout the whole lot
        
        Queue<int[]> q= new LinkedList<>();
        boolean[][] visited = new boolean[board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='O'&&(i==board.length-1||i==0||j==0||j==board[0].length-1)){
                    //perform BFS
                    q.offer(new int[]{i,j});
                    board[i][j]='E';
                    visited[i][j]=true;
                    
                    while(!q.isEmpty()){
                        int[] curr = q.poll();
                        
                        for(int[] dir:direction){
                            int newx= curr[0]+dir[0];
                            int newy = curr[1]+dir[1];
                            if(newx>=0&&newx<board.length&&newy>=0&&newy<board[0].length&&board[newx][newy]=='O'){
                                
                                if(visited[newx][newy]==false){
                                    q.offer(new int[]{newx,newy});
                                    visited[newx][newy]=true;
                                    board[newx][newy]='E';
                                }                                
                            }                            
                        }                                        
                    }
                }
            }
        }
        
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='E'){
                    board[i][j]='O';
                } else{board[i][j]='X';}
                
            }
        }
        
    }
    
    
}