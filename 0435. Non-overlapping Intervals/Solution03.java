/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 49.78 %
    Runtime : 106 ms
    Memory Usage : 100.2 MB
    Testcase : 58 / 58 passed
    Ranking : 
        Your runtime beats 63.04 % of java submissions.
        Your memory usage beats 61.49 % of java submissions.
}
*/

class Solution {
    //reverse engineering 
    public int eraseOverlapIntervals(int[][] intervals) {
        //check for corner cases
        if(intervals.length==0) return 0;
        int answer=0;
        //sort using lamda function on start time
        Arrays.sort(intervals,(a,b)->a[0]==b[0]?a[1]-b[1]:a[0]-b[0]);
        int end = intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            int[] curr = intervals[i];
            int curr_start = curr[0];
            int curr_end = curr[1];
            if(curr_start<end){
                //System.out.println(curr_start);
                answer++;
                end=Math.min(end,curr_end);
            }else{
                end = curr_end;
            }
            
        }
        // for(int i=0;i<intervals.length;i++){
        //     System.out.print(intervals[i][0]+"   ");
        //     System.out.println(intervals[i][1]);
        // }
        
        return answer;
        
    }
}