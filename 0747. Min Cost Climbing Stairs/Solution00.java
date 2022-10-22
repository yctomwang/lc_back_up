/*
Submission Detail:{
    Difficulty : Easy
    Acceptance Rate : 62.31 %
    Runtime : 2 ms
    Memory Usage : 44.1 MB
    Testcase : 283 / 283 passed
    Ranking : 
        Your runtime beats 35.24 % of java submissions.
        Your memory usage beats 21.16 % of java submissions.
}
*/

class Solution {
    public int minCostClimbingStairs(int[] cost) {
        //dp[] means the minimum cost to get to the top
        int[] dp = new int[cost.length+1];
        //dp[] means minimum 
        dp[0] = 0;
        dp[1] = 0;
        
        if(cost.length<=2) return Math.min(cost[0],cost[1]);
        
        for(int i=2;i<=cost.length;i++){
            dp[i]=Math.min(dp[i-1]+cost[i-1],dp[i-2]+cost[i-2]);
        }
        // for(int i=0;i<cost.length;i++){
        //     System.out.println(dp[i]);
        // }
        return dp[cost.length];
    }
}