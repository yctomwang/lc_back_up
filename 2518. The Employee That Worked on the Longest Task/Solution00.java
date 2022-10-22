/*
Submission Detail:{
    Difficulty : Easy
    Acceptance Rate : 48.63 %
    Runtime : 3 ms
    Memory Usage : 54.3 MB
    Testcase : 514 / 514 passed
    Ranking : 
        Your runtime beats 40.39 % of java submissions.
        Your memory usage beats 34.19 % of java submissions.
}
*/

class Solution {
    public int hardestWorker(int n, int[][] logs) {
        int id = logs[0][0];
        int global_hours = logs[0][1]-0;
        for(int i=1;i<logs.length;i++){
            int tempid= logs[i][0];
            int temphour = logs[i][1]-logs[i-1][1];
            //System.out.println(temphour);
            if(temphour>=global_hours){
                if(temphour>global_hours){
                    id=tempid;
                    global_hours=temphour;
                }
                else if(temphour==global_hours&&tempid<id){
                    id=tempid;
                    global_hours=temphour;
                }
            }
        }
        
        return id;
    }
}