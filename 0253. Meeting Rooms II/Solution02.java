/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 50.28 %
    Runtime : 13 ms
    Memory Usage : 46.8 MB
    Testcase : 78 / 78 passed
    Ranking : 
        Your runtime beats 42.62 % of java submissions.
        Your memory usage beats 00.00 % of submissions.
}
*/

class Solution {
    public int minMeetingRooms(int[][] intervals) {
        //meeting [0,                     30]
        //            [5,10][15,20]
        //
        //asking for the maximum number of meetings held at the same time
        
        //
        List<int[]> sweepLine = new ArrayList<>();
        
        //loop through intervals
        for(int i=0;i<intervals.length;i++){
            //positive 1 for starting a new meeting
            //negative 1 for ending of a meeting
            sweepLine.add(new int[]{intervals[i][0],1});
            sweepLine.add(new int[]{intervals[i][1],-1});
        }
        
        Collections.sort(sweepLine,(a,b)->{
            //if the time are the same, we do compare them by -1 or 1, otherwise compare by time
            if(a[0]==b[0]){
                return a[1]-b[1];
                
            }else{
                return a[0]-b[0];
            }
            
        });
        int answer=0;
        int count=0;
        for(int[] point: sweepLine){
            count+=point[1];
            answer=Math.max(answer,count);
        }
        
        return answer;
    }
}