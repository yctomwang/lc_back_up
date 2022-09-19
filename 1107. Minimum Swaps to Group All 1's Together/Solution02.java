/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 60.82 %
    Runtime : 12 ms
    Memory Usage : 74.9 MB
    Testcase : 36 / 36 passed
    Ranking : 
        Your runtime beats 31.59 % of java submissions.
        Your memory usage beats 00.00 % of submissions.
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