/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 48.63 %
    Runtime : 0 ms
    Memory Usage : 41.2 MB
    Testcase : 68 / 68 passed
    Ranking : 
        Your runtime beats 100.00 % of java submissions.
        Your memory usage beats 67.65 % of java submissions.
}
*/

class Solution {
    
    public int rob(int[] nums) {
        return dfs(nums,nums.length-1,new Integer[nums.length]);
        //start with n go back to 0
    }
    
    public int dfs(int[] nums, int index, Integer[] memo){
        if(index<0) return 0;
        if(memo[index]!=null) return memo[index];
        int answer= Math.max(dfs(nums,index-1,memo),dfs(nums,index-2,memo)+nums[index]);
       // int answer = Math.max(dfs(nums,index-1,memo),dfs(nums,index-2,memo)+nums[index]);
        return memo[index]=answer;
        
    }
    
    
    
}