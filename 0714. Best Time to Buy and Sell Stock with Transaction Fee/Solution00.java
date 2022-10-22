/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 64.24 %
    Runtime : 62 ms
    Memory Usage : 75.5 MB
    Testcase : 44 / 44 passed
    Ranking : 
        Your runtime beats 25.02 % of java submissions.
        Your memory usage beats 47.65 % of java submissions.
}
*/

class Solution {
    public int maxProfit(int[] prices, int fee) {
        int[][] dp = new int[prices.length][2];
        
        //base case
        dp[0][0] =0;
        dp[0][1] = - prices[0];
        for(int i=1;i<prices.length;i++){
            //no stock
            dp[i][0] = Math.max(dp[i-1][0],dp[i-1][1]+prices[i] - fee);
            
            dp[i][1]= Math.max(dp[i-1][1],dp[i-1][0]-prices[i]);
        }
        return dp[prices.length-1][0];
    }
}