/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 49.78 %
    Runtime : 152 ms
    Memory Usage : 100.1 MB
    Testcase : 58 / 58 passed
    Ranking : 
        Your runtime beats 9.51 % of java submissions.
        Your memory usage beats 61.49 % of java submissions.
}
*/

class Solution {
    //reverse engineering 
    public int eraseOverlapIntervals(int[][] intervals) {
        
        int answer=0;
        //sort using lamda function on start time
        Arrays.sort(intervals,(a,b)->a[0]==b[0]?a[1]-b[1]:a[0]-b[0]);
        int end = intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            int[] curr = intervals[i];
            int curr_start = curr[0];
            int curr_end = curr[1];
            if(curr_start<end){
                
                answer++;
                end=Math.min(end,curr_end);
            }else{
                end = curr_end;
            }
            
        }
        
        return answer;  
    }
}