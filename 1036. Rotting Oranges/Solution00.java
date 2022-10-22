/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 52.44 %
    Runtime : 2 ms
    Memory Usage : 41.9 MB
    Testcase : 306 / 306 passed
    Ranking : 
        Your runtime beats 97.13 % of java submissions.
        Your memory usage beats 87.60 % of java submissions.
}
*/

class Solution {
    
    //scan through the whole grid
    //check for total number of oranges
    int[][] direction = new int[][]{{0,1},{1,0},{-1,0},{0,-1}};
    public int orangesRotting(int[][] grid) {
        int total_orange =0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1||grid[i][j]==2){
                    total_orange++;
                }
            }
        }
        
        int minute=0;
        int rotten_orange=0;
        Queue<int[]> queue = new LinkedList<>();
        
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2){
                    queue.offer(new int[]{i,j});
                    rotten_orange++;
                }
            }
        }
        
        
        while(!queue.isEmpty()){
            int qsize = queue.size();
            for(int i=0;i<qsize;i++){
                int[] curr_orange = queue.poll();
                for(int[] dir: direction){
                    int newx = curr_orange[0]+dir[0];
                    int newy = curr_orange[1]+dir[1];
                    if(newx>=0&&newy>=0&&newx<grid.length&&newy<grid[0].length){
                        if(grid[newx][newy]!=0&&grid[newx][newy]!=2){
                            queue.offer(new int[]{newx,newy});
                            rotten_orange++;
                            grid[newx][newy]=2;
                        }
                    }
                    
                }
            }
            minute++;
            
        }
        if(rotten_orange==total_orange){
            if(minute==0) return 0;
            return minute-1;
        } 
        
        
        return -1;
    }
}