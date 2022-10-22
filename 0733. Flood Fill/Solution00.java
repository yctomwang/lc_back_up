/*
Submission Detail:{
    Difficulty : Easy
    Acceptance Rate : 60.35 %
    Runtime : 1 ms
    Memory Usage : 43 MB
    Testcase : 277 / 277 passed
    Ranking : 
        Your runtime beats 90.46 % of java submissions.
        Your memory usage beats 95.62 % of java submissions.
}
*/

class Solution {
    
    int[][] directions = new int[][]{{0,1},{1,0},{-1,0},{0,-1}};
    
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        //consider out of bounds
        //bfs flood fill 
        
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{sr,sc});
        int starting_color = image[sr][sc];
        //System.out.println(starting_color);
        image[sr][sc] = color;
        while(!queue.isEmpty()){
            int[] curr = queue.poll();
            for(int[] dir: directions){
                int newx = curr[0]+dir[0];
                int newy = curr[1]+dir[1];
                if(newx>=0&&newy>=0&&newx<image.length&&newy<image[0].length&&(image[newx][newy]==starting_color&&image[newx][newy]!=color)){
                    image[newx][newy]=color;
                    queue.offer(new int[]{newx, newy});
                }
            }
        }
        
        return image;
    }
    // public void dfs(){
    //     int[][] image, int r, int c, int color, int newColor
    // }
}