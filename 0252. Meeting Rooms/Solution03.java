/*
Submission Detail:{
    Difficulty : Easy
    Acceptance Rate : 57.03 %
    Runtime : 10 ms
    Memory Usage : 45 MB
    Testcase : 78 / 78 passed
    Ranking : 
        Your runtime beats 63.08 % of java submissions.
        Your memory usage beats 49.81 % of java submissions.
}
*/

class Solution {
    public boolean canAttendMeetings(int[][] intervals) {
        
        
        boolean answer= true;
        Arrays.sort(intervals,(a, b)->{
            return a[0]-b[0];
            
        });
        
        //0,30  5,10 15,20
        for(int i=0; i<intervals.length-1;i++){
            if(intervals[i][1]>intervals[i+1][0]){
                return false;
            }
        }
        return answer;
        
    }
}