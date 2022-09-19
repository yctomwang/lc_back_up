/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 55.25 %
    Runtime : 211 ms
    Memory Usage : 117.7 MB
    Testcase : 75 / 75 passed
    Ranking : 
        Your runtime beats 15.18 % of java submissions.
        Your memory usage beats 00.00 % of submissions.
}
*/

class Solution {
    int[][] direction = new int[][]{{0,-1},{-1,0},{1,0},{0,1}};
    public int minimumEffortPath(int[][] heights) {
    //guess the minimum effort
    //then check if such as path exists
    int left=0;
    int right=1000000;
    //BFS(heights,5);
        while(left<=right){
            int mid = left+(right-left)/2;
            if(BFS(heights,mid)==true){
                right=mid-1;
            }else{
                left=mid+1;
            }
        
        }
        return left;
    }
    
    public boolean BFS(int[][] heights, int mid){
        // int max=heights[0][0];
        // int min=heights[0][0];
        boolean[][] visited = new boolean[heights.length][heights[0].length];
        Queue<int[]> q = new LinkedList<>();
        int[] start = new int[]{0,0};
        q.offer(start);
        visited[start[0]][start[1]]=true;
        //check for boundery [1] contain only 1 item
        
        while(!q.isEmpty()){
            int[] curr= q.poll();
            
            for(int[] dir:direction){
                int newx=curr[0]+dir[0];
                int newy=curr[1]+dir[1];
                //add to neightbour list
                //mark as visited
                if(newx>=0&&newy>=0&&newx<heights.length&&newy<heights[0].length&&visited[newx][newy]!=true){
                    
                    if(Math.abs(heights[newx][newy]-heights[curr[0]][curr[1]])<=mid){
                        
                        q.offer(new int[]{newx,newy});
                        visited[newx][newy]=true;
                    }
                }
                
            }
        }
        if(visited[heights.length-1][(heights[0].length-1)]==true){
            return true;
        }
        
        return false;
    }
}