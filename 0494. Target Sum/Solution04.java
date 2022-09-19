/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 45.49 %
    Runtime : 1241 ms
    Memory Usage : 41.9 MB
    Testcase : 139 / 139 passed
    Ranking : 
        Your memory usage beats 74.49 % of java submissions.
        Your memory usage beats 00.00 % of submissions.
}
*/

class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return dfs(target,nums,0,0);
    }
    
    //bottom up dfs
    public int dfs(int target, int[] nums, int sum, int currDepth){
        if(currDepth==nums.length){
            return sum==target?1:0;
        }
        
        return dfs(target,nums,sum+nums[currDepth],currDepth+1)+dfs(target,nums,sum-nums[currDepth],currDepth+1);
    }
}