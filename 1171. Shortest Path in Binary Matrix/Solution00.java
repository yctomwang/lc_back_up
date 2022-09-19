/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 44.47 %
    Runtime : 32 ms
    Memory Usage : 59.6 MB
    Testcase : 89 / 89 passed
    Ranking : 
        Your runtime beats 49.55 % of java submissions.
        Your memory usage beats 57.21 % of java submissions.
}
*/

class Solution {
    //75-30 done writing
    //75-26 mostly working
    int[][] directions = new int[][]{{0,1},{0,-1},{1,0},{-1,0},{1,1},{-1,-1},{-1,1},{1,-1}};
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n= grid.length;
        boolean[][] visited = new boolean[grid.length][grid.length];
        Queue<int[]> q = new LinkedList<>();
        if(grid[0][0]==1){
            return -1;
        }
        if(n==1&&grid[0][0]==0){
            return 1;
        }
            
            
        int level=1;
        q.offer(new int[]{0,0});
        visited[0][0]=true;
        
        while(!q.isEmpty()){
            int qsize=q.size();
            //System.out.println(qsize);
            for(int i=0;i<qsize;i++){
                int[] curr= q.poll();
                int curx=curr[0];
                int cury=curr[1];
                for(int[] dir:directions){
                    int newx=curx+dir[0];
                    int newy=cury+dir[1];
                    
                    if(newx>=0&&newy>=0&&newx<n&&newy<n&&grid[newx][newy]!=1&&visited[newx][newy]!=true){
                        // System.out.print("newx"+newx);
                        // System.out.println("newy"+newy);
                        if(newx==n-1&&newy==n-1){
                            return level+1;
                        }
                        q.offer(new int[]{newx,newy});
                        visited[newx][newy]=true;
                        
                    }
                }
                
                
            }
            level++;
        }
        
        return -1;
    }
}