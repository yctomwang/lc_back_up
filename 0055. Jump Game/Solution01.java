/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 38.42 %
    Runtime : 5 ms
    Memory Usage : 67.7 MB
    Testcase : 170 / 170 passed
    Ranking : 
        Your runtime beats 53.25 % of java submissions.
        Your memory usage beats 62.48 % of java submissions.
}
*/

class Solution {
    public boolean canJump(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length;i++){
            int curr= nums[i];
            //update the max distance we go reach
            if(i<=max){
                max=Math.max(i+nums[i],max);
            }
            
            
            
        }
        
        
        if(nums.length==1)return true;
        if(max<nums.length-1) return false;
        return true;
        
    }
}