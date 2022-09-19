/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 60.08 %
    Runtime : 45 ms
    Memory Usage : 57 MB
    Testcase : 62 / 62 passed
    Ranking : 
        Your runtime beats 15.64 % of java submissions.
        Your memory usage beats 46.90 % of java submissions.
}
*/

class Solution {
    //18 minutes to write
    int[][] direction={{1,0},{-1,0},{0,1},{0,-1}};
    //int[][] direction = {{0,1},{0,-1},{1,0},{-1,0}};
    public void wallsAndGates(int[][] rooms) {
        
        Queue<int[]> q = new LinkedList<>();
        boolean[][] visited = new boolean[rooms.length][rooms[0].length];
        for(int i=0;i<rooms.length;i++){
            for(int j=0;j<rooms[0].length;j++){
                if(rooms[i][j]==0){
                    int[] curr = new int[]{i,j};
                    q.offer(curr);
                    visited[i][j]=true;
                    //add into visited set;
                }
            }
        }
        
        int level =1;
        
        while(!q.isEmpty()){
            int qize=q.size();
            
            //System.out.println(qize);
            for(int i=0;i<qize;i++){
                int[] curr = q.poll();
                
                for(int[] dir:direction){
                    int newx= curr[0]+dir[0];
                    int newy= curr[1]+dir[1];
                    if(newx>=0&&newy>=0&&newx<rooms.length&&newy<rooms[0].length&&rooms[newx][newy]!=-1&&visited[newx][newy]!=true){
                        //offer into the queue
                        rooms[newx][newy]=level;
                        q.offer( new int[]{newx,newy});
                        visited[newx][newy]=true;
                    }
                }
            }
            System.out.println(level);
            level++;
           
            
            
            
            
        }
        
        //similar to 01 matrix
        //multi start BFS
        
        
        
    }
}