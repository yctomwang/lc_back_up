/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 63.24 %
    Runtime : 3 ms
    Memory Usage : 42.2 MB
    Testcase : 200 / 200 passed
    Ranking : 
        Your runtime beats 37.01 % of java submissions.
        Your memory usage beats 92.75 % of java submissions.
}
*/

class Solution {
    public int maxProfit(int[] prices) {
        //meaning of dp array is profit at a certain day with or without stock
        int[][] dp = new int[prices.length][2];
        
        //base case
        dp[0][0] =0;
        dp[0][1] = - prices[0];
        for(int i=1;i<prices.length;i++){
            //no stock
            dp[i][0] = Math.max(dp[i-1][0],dp[i-1][1]+prices[i]);
            
            dp[i][1]= Math.max(dp[i-1][1],dp[i-1][0]-prices[i]);
        }
        return dp[prices.length-1][0];
    }
}