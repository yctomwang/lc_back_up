/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 53.26 %
    Runtime : 144 ms
    Memory Usage : 74.3 MB
    Testcase : 85 / 85 passed
    Ranking : 
        Your runtime beats 57.54 % of java submissions.
        Your memory usage beats 31.70 % of java submissions.
}
*/

class Solution {
    int[][] direction = new int[][]{{0,1},{-1,0},{1,0},{0,-1}};
    
    public int maximumMinimumPath(int[][] grid) {
        
    int right=Integer.MIN_VALUE;
    int left=Integer.MAX_VALUE;
    //find the boundery of the binary search
    for(int j=0;j<grid.length;j++){
        for(int k=0;k<grid[0].length;k++){
            right=Math.max(right,grid[j][k]);
            left=Math.min(left,grid[j][k]);
        }
    }
    
    //binary search
    while(left<=right){
        boolean[][] visited= new boolean[grid.length][grid[0].length];
        int mid= left+(right-left)/2;
        dfs(visited,mid,grid,0,0);
        if(visited[grid.length-1][grid[0].length-1]==true){
            left=mid+1;
        }else{
            right=mid-1;
        }
    }
    return right;
        
    }
    
    
    public void dfs(boolean[][] visited, int mid, int[][] grid,int x, int y){
        //out of bounds or invalid(larger than mid)
        
        if(x<0||y<0||x>=grid.length||y>=grid[0].length||grid[x][y]<mid||visited[x][y]==true){
            return;
        }
       
        visited[x][y]=true;
        for(int[] dir:direction){
            int newx=x+dir[0];
            int newy=y+dir[1];
            dfs(visited,mid,grid,newx,newy);
        }
    }
    
    
}