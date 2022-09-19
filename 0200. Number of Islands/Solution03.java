/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 55.90 %
    Runtime : 13 ms
    Memory Usage : 57.4 MB
    Testcase : 49 / 49 passed
    Ranking : 
        Your runtime beats 14.64 % of java submissions.
        Your memory usage beats 49.72 % of java submissions.
}
*/

class Solution {
    public int numIslands(char[][] grid) {
        int answer=0;
        int rowLen = grid.length;
        int colLen = grid[0].length;
        
        System.out.println(grid.length);
        System.out.println(grid[0].length);
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    answer++;
                    //mark as visited
                    grid[i][j]='0';
                    //check out of bound or whatever
                    //we add neighbour into the queue
                    Queue<int[]> q= new LinkedList<>();
                    q.offer(new int[]{i,j});
                    
                    while(!q.isEmpty()){
                        int[] current = q.poll();
                        int x = current[0];
                        int y= current[1];
                        //if the thing equals to one, then we add it into the queue and keep searching
                   if (x - 1 >= 0 && grid[x-1][y] == '1') {
              q.add(new int[]{x-1,y});
              grid[x-1][y] = '0';
            }
            if (x + 1 < rowLen && grid[x+1][y] == '1') {
               q.add(new int[]{x+1,y});
              grid[x+1][y] = '0';
            }
            if (y - 1 >= 0 && grid[x][y-1] == '1') {
               q.add(new int[]{x,y-1});
              grid[x][y-1] = '0';
            }
            if (y + 1 < colLen && grid[x][y+1] == '1') {
              q.add(new int[]{x,y+1});
              grid[x][y+1] = '0';
            }
                            
                    }
                    
                
                    
                    //deal with flapping it
                }
            }
        }
        
        return answer;
        
    }
    
    
    public void BFS(){}
}