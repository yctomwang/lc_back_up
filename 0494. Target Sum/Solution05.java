/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 45.49 %
    Runtime : 835 ms
    Memory Usage : 42.7 MB
    Testcase : 139 / 139 passed
    Ranking : 
        Your runtime beats 17.59 % of java submissions.
        Your memory usage beats 53.06 % of java submissions.
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