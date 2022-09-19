/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 53.64 %
    Runtime : 11 ms
    Memory Usage : 55.5 MB
    Testcase : 113 / 113 passed
    Ranking : 
        Your runtime beats 44.49 % of java submissions.
        Your memory usage beats 22.32 % of java submissions.
}
*/

class Solution {
    public int [][] direction = new int[][]{{0, 1}, {1, 0}, {-1, 0}, {0, -1}};
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
   
    List<List<Integer>> answer = new ArrayList<>();
        
    //deal with pacific ocean water
    Queue<int[]> pacificQueue = new LinkedList<>();
    Queue<int[]> atlanticQueue = new LinkedList<>();
    boolean[][] visitedPaci = new boolean[heights.length][heights[0].length];
    boolean[][] visitedAta = new boolean[heights.length][heights[0].length];
    
    int numRows = heights.length;
    int numCols = heights[0].length;
       
        
        // Setup each queue with cells adjacent to their respective ocean
        
    for(int i = 0; i < numRows; i++) {
        pacificQueue.offer(new int[]{i, 0});
        visitedPaci[i][0]=true;
        atlanticQueue.offer(new int[]{i, numCols - 1});
        visitedAta[i][numCols-1]=true;
        
        
    }
    for (int i = 0; i < numCols; i++) {
        if(visitedPaci[0][i]!=true){
            pacificQueue.offer(new int[]{0, i});
        visitedPaci[0][i]=true;
        }
        if(visitedAta[numRows-1][i]!=true){
            atlanticQueue.offer(new int[]{numRows - 1, i});
        visitedAta[numRows-1][i]=true;
        }
        
    }
    
    while(!pacificQueue.isEmpty()){
        int[] curr= pacificQueue.poll();
        for(int[] dir: direction){
            int newx= curr[0]+dir[0];
            int newy= curr[1]+dir[1];
            //offer into the queue
            if(newx>=0&&newy>=0&&newx<numRows&&newy<numCols&&visitedPaci[newx][newy]!=true&&heights[newx][newy]>=heights[curr[0]][curr[1]]){
               pacificQueue.offer(new int []{newx, newy});
                visitedPaci[newx][newy]=true;
            }
        }
    }
    
    while(!atlanticQueue.isEmpty()){
        int[] curr= atlanticQueue.poll();
        for(int[] dir: direction){
            int newx= curr[0]+dir[0];
            int newy= curr[1]+dir[1];
            //offer into the queue
            if(newx>=0&&newy>=0&&newx<numRows&&newy<numCols&&visitedAta[newx][newy]!=true&&heights[newx][newy]>=heights[curr[0]][curr[1]]){
               atlanticQueue.offer(new int []{newx, newy});
            visitedAta[newx][newy]=true;
            }
        }
    }
    //System.out.println(visitedPaci[0][1]);
    
    for(int a =0;a<numRows;a++){
        for(int b=0;b<numCols;b++){
            if(visitedPaci[a][b]&&visitedAta[a][b]){
                answer.add(List.of(a,b));
            }
        }
    }
        
    return answer;
    }
}