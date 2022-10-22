/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 64.24 %
    Runtime : 73 ms
    Memory Usage : 76 MB
    Testcase : 44 / 44 passed
    Ranking : 
        Your runtime beats 21.04 % of java submissions.
        Your memory usage beats 36.71 % of java submissions.
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