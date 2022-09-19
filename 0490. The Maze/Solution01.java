/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 55.29 %
    Runtime : 8 ms
    Memory Usage : 54.1 MB
    Testcase : 78 / 78 passed
    Ranking : 
        Your runtime beats 43.02 % of java submissions.
        Your memory usage beats 61.25 % of java submissions.
}
*/

class Solution {
    int[][] dir={{1,0},{-1,0},{0,1},{0,-1}};
    public boolean hasPath(int[][] maze, int[] start, int[] destination) {
    //similar to a hashset that could store visited
    boolean[][] visited = new boolean[maze.length][maze[0].length];
    Queue<int[]> q = new LinkedList<>();
    q.offer(start);
    visited[start[0]][start[1]]=true;
        
    while(!q.isEmpty()){
        int qsize= q.size();
        
        for(int i=0;i<qsize;i++){
            int[] curr= q.poll();
            
            //chec
            
            for(int[]d:dir){
                int newx= curr[0]+d[0];
                int newy= curr[1]+d[1];
                //not until invalid, its not the next state
                while(newx>=0&&newx<maze.length&&newy>=0&&newy<maze[0].length&&maze[newx][newy]==0){
                    newx+=d[0];
                    newy+=d[1];
                }
                
                newx-=d[0];
                newy-=d[1];
                
                //cehck
                if(visited[newx][newy]==false){
                    q.offer(new int[]{newx, newy});
                    visited[newx][newy]=true;
                }
            
            }
            
            
        }
    }
    if(visited[destination[0]][destination[1]]==true) return true;
        
    return false;
    }
}