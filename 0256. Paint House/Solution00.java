/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 60.50 %
    Runtime : 1 ms
    Memory Usage : 43.7 MB
    Testcase : 100 / 100 passed
    Ranking : 
        Your runtime beats 94.89 % of java submissions.
        Your memory usage beats 30.06 % of java submissions.
}
*/

class Solution {
    public int minCost(int[][] costs) {
        int[]dp = new int[3];
        for(int i=0;i<costs.length;i++){
            int dp0= costs[i][0]+Math.min(dp[1],dp[2]);
            int dp1 = costs[i][1]+Math.min(dp[0],dp[2]);
            int dp2 = costs[i][2]+Math.min(dp[0],dp[1]);
            dp[0]=dp0;
            dp[1]=dp1;
            dp[2]=dp2;
        }
        
        return Math.min(dp[0],Math.min(dp[1],dp[2]));
    }
}