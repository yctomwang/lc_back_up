/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 60.82 %
    Runtime : 13 ms
    Memory Usage : 72.2 MB
    Testcase : 36 / 36 passed
    Ranking : 
        Your runtime beats 24.21 % of java submissions.
        Your memory usage beats 80.09 % of java submissions.
}
*/

class Solution {
    public int minSwaps(int[] data) {
       
        int count=0;
        for(int a=0; a<data.length;a++){
           if(data[a]==1) {
               count++;
           }
        }
        
        int left=0;
        //how many 1s we have in the sliding window
        int currentCount=0;
        
        int global=0;
        
        for(int i=0;i<data.length;i++){
            int curr= data[i];
            if(curr==1)currentCount++;
            while((i-left+1)>count){
                int remove=data[left];
                if(remove==1)currentCount--;
                left++;
            }
            if(currentCount>global){
                global=currentCount;
            }
        }
        return count-global;
    }
}