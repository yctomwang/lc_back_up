/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 46.24 %
    Runtime : 236 ms
    Memory Usage : 54 MB
    Testcase : 281 / 281 passed
    Ranking : 
        Your runtime beats 00.00 % of submissions.
        Your memory usage beats 00.00 % of submissions.
}
*/

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
        Arrays.sort(nums);
        int answer=nums[0]+nums[1]+nums[2];
        //fix one number
        for(int i=0; i<nums.length-2;i++){
            int leftindex=i+1;
            int rightindex=nums.length-1;
            int temptarget=target-nums[i];
            
            
            while(leftindex<rightindex){
                //equal we
                int currentanswer=nums[i]+nums[leftindex]+nums[rightindex];
                 
                if((nums[leftindex]+nums[rightindex])<temptarget){
                    leftindex++;
                }
                else{
                    rightindex--;
                }
               if(Math.abs(target-currentanswer)<Math.abs(target-answer)){
                    answer=currentanswer;
                }
            
            }
        }
        return answer;
        
    }
}