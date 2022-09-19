/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 57.67 %
    Runtime : 3 ms
    Memory Usage : 80.8 MB
    Testcase : 94 / 94 passed
    Ranking : 
        Your runtime beats 75.34 % of java submissions.
        Your memory usage beats 17.78 % of java submissions.
}
*/

class Solution {
    public long minimumHealth(int[] damage, int armor) {
    long answer =0;
    long max=0;
    //boolean flag=false;
    for(int i=0;i<damage.length;i++){
        answer+=damage[i];
        max=Math.max(max,damage[i]);
        
        
    }
    if(max>=armor){
        return (answer+1-armor);
    }else if(max<armor){
        return (answer+1-max);
    }
    return 0;
    }
}