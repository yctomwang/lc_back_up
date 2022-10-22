/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 48.63 %
    Runtime : 0 ms
    Memory Usage : 41.4 MB
    Testcase : 68 / 68 passed
    Ranking : 
        Your runtime beats 100.00 % of java submissions.
        Your memory usage beats 60.88 % of java submissions.
}
*/

class Solution {
    public int rob(int[] nums) {
        int [] dp = new int[nums.length+1];
        dp[0] = 0;
        dp[1] = nums[0];
        for(int i=2;i<dp.length;i++){
            dp[i]=Math.max(dp[i-2]+nums[i-1],dp[i-1]);
            
        }
        //System.out.println(dp);
        // for(int i=0;i<dp.length;i++){
        //     System.out.println(dp[i]);
        // }
        return dp[nums.length];
    }
}