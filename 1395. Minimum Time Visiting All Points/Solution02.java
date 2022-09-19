/*
Submission Detail:{
    Difficulty : Easy
    Acceptance Rate : 79.13 %
    Runtime : 1 ms
    Memory Usage : 43.3 MB
    Testcase : 122 / 122 passed
    Ranking : 
        Your runtime beats 97.22 % of java submissions.
        Your memory usage beats 77.98 % of java submissions.
}
*/

class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        //System.out.println(points.length);
        int total=0;
        for(int i=0;i<points.length-1;i++){
            int x1= points[i][0];
            int y1= points[i][1];
            
            int x2=points[i+1][0];
            int y2= points[i+1][1];
            
            total+=Math.max(Math.abs(x1-x2),Math.abs(y1-y2));
            
            
        }
        
        return total;
    }
}