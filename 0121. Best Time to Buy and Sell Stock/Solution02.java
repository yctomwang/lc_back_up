/*
Submission Detail:{
    Difficulty : Easy
    Acceptance Rate : 54.48 %
    Runtime : 92 ms
    Memory Usage : 110.7 MB
    Testcase : 211 / 211 passed
    Ranking : 
        Your runtime beats 00.00 % of submissions.
        Your memory usage beats 00.00 % of submissions.
}
*/

class Solution {
    public int maxProfit(int[] prices) {
        //check for boundery case
        if(prices==null||prices.length==0) return 0;
        //dp solution
        int n = prices.length;
        //2d array to represent the current state
        //dp array means profit at a certain state
        //dp[] means days
        //dp[][] means days and if stock held or not
        int[][] dp = new int[n][2];
        dp[0][0] =0;//no stock held
        dp[0][1] = -prices[0];// bought stock on day 0
        for(int i=1;i<prices.length;i++){
            //no stock in hand on day i: came from either yesterday no stock or yesterday stock sold
            dp[i][0] = Math.max(dp[i-1][0],dp[i-1][1]+prices[i]);
            //stock on day i: came from day i-1 have stock, or no stock 
            dp[i][1] = Math.max(dp[i-1][1],-prices[i]);
        }
        
        return dp[n-1][0];
    }
}