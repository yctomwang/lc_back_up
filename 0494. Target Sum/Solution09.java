/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 45.56 %
    Runtime : 1217 ms
    Memory Usage : 41.7 MB
    Testcase : 139 / 139 passed
    Ranking : 
        Your runtime beats 8.33 % of java submissions.
        Your memory usage beats 81.10 % of java submissions.
}
*/

class Solution {
    int sum=0;
    int count=0;
    //2^N
    public int findTargetSumWays(int[] nums, int target) {
        backTrack(nums,0,target);
        return count;
    }
    
    
    public void backTrack(int[] nums, int index, int target){
        if(index ==nums.length){
            if(sum==target){
                count++;
            }
            return;
        }
        //making choice
        sum+=nums[index];
        //call backTrack
        backTrack(nums, index+1,target);
        sum-=nums[index];
        
        sum-=nums[index];
        backTrack(nums,index+1, target);
        sum+=nums[index];
        
        
        //revert choice
        
    }
    
    
}