/*
Submission Detail:{
    Difficulty : Easy
    Acceptance Rate : 60.41 %
    Runtime : 3 ms
    Memory Usage : 43.5 MB
    Testcase : 125 / 125 passed
    Ranking : 
        Your runtime beats 71.69 % of java submissions.
        Your memory usage beats 00.00 % of submissions.
}
*/

class Solution {
    public int twoSumLessThanK(int[] nums, int k) {
    //set default answer to -1
    int answer= -1;
    
        
    Arrays.sort(nums);
    int leftindex=0;
    int rightindex=nums.length-1;
    while(leftindex<rightindex){
        int tempsum= nums[leftindex]+nums[rightindex];
        if(tempsum<k){
            if(answer==-1){
                answer=tempsum;
            }
            if(Math.abs(k-tempsum)<Math.abs(k-answer)){
                answer=tempsum;
            }
        
        leftindex++;
        
        }
        else{
            rightindex--;
        }
    }
    
    return answer;
        
        
    }
}