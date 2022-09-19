/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 35.71 %
    Runtime : 1 ms
    Memory Usage : 44 MB
    Testcase : 280 / 280 passed
    Ranking : 
        Your runtime beats 87.84 % of java submissions.
        Your memory usage beats 28.49 % of java submissions.
}
*/

class Solution {
    public boolean search(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target)return true;
        }
        
        return false;
    }
}