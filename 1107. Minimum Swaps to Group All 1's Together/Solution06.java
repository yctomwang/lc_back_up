/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 60.82 %
    Runtime : 15 ms
    Memory Usage : 73.3 MB
    Testcase : 36 / 36 passed
    Ranking : 
        Your runtime beats 15.79 % of java submissions.
        Your memory usage beats 55.23 % of java submissions.
}
*/

class Solution {
    public int minSwaps(int[] data) {
        //in
        //out 
        //calculate
        /*To group all the ones together, we first need to know
        how many 1s have we got, through someting like a for loop right
        
        our window 
        //11110000
        //11001100
        //10101010
        */
        int count=0;
        for(int a=0; a<data.length;a++){
           if(data[a]==1) {
               count++;
           }
        }
        //System.out.println(count);
        //left pointer
        int left=0;
        //the max number of 1s
        int max=0;
        //the gloabl variable
        int global=0;
        
        for(int i=0;i<data.length;i++){
            int curr= data[i];
            if(curr==1)max++;
            while((i-left+1)>count){
                int remove=data[left];
                if(remove==1)max--;
                left++;
            }
            if(max>global){
                global=max;
            }
        }
        return count-global;
    }
}