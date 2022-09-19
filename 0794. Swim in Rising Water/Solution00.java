/*
Submission Detail:{
    Difficulty : Hard
    Acceptance Rate : 59.43 %
    Runtime : 4 ms
    Memory Usage : 44.9 MB
    Testcase : 43 / 43 passed
    Ranking : 
        Your runtime beats 98.82 % of java submissions.
        Your memory usage beats 69.47 % of java submissions.
}
*/

class Solution {
    //Translate into human words
    //its finding the path with the minium maxmimum value
    int[][] direction = new int[][]{{0,1},{-1,0},{1,0},{0,-1}};
    public int swimInWater(int[][] grid) {
        int left=0;
        int right=grid.length*grid.length-1;
        
       
        while(left<=right){
            boolean[][] visited  = new boolean[grid.length][grid[0].length];
            int mid=left+(right-left)/2;
            if(dfsHelper(grid,mid,visited,0,0)==true){
                right=mid-1;
            }else{
                left=mid+1;    
            }
        }
        return left;
    }
    
    
    boolean dfsHelper(int[][] grid, int mid, boolean[][] visited,int x, int y){
        //exit out of DFS
        
        
        if(x<0||y<0||x>=grid.length||y>=grid[0].length||visited[x][y]==true||grid[x][y]>mid){
            return false;
        }
        
                
        visited[x][y] = true;
        
        if(x==grid.length-1&&y==grid[0].length-1){
            return true;
        }
        
        return dfsHelper(grid,mid,visited,x,y+1) || 
               dfsHelper(grid,mid,visited,x,y-1) ||
               dfsHelper(grid,mid,visited,x-1,y) || 
               dfsHelper(grid,mid,visited,x+1,y);
        //out of bound or visted before, return falsee or bigger tha mid
        
        
    }
    
}