/*
Submission Detail:{
    Difficulty : Easy
    Acceptance Rate : 90.04 %
    Runtime : 0 ms
    Memory Usage : 43.4 MB
    Testcase : 53 / 53 passed
    Ranking : 
        Your runtime beats 100.00 % of java submissions.
        Your memory usage beats 37.85 % of java submissions.
}
*/

class Solution {
    public int[] runningSum(int[] nums) {
    int[] answer= new int[nums.length];
        
    int curr=0;
    for(int i=0;i<nums.length;i++){
        curr+=nums[i];
        answer[i]=curr;
    }
    return answer;
    }
}