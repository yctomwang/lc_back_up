/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 54.39 %
    Runtime : 2 ms
    Memory Usage : 42.6 MB
    Testcase : 210 / 210 passed
    Ranking : 
        Your runtime beats 61.94 % of java submissions.
        Your memory usage beats 25.13 % of java submissions.
}
*/

class Solution {
    public int maxProfit(int[] prices) {
        //when sell we have cooldown
        //buy and sell we have unlimited times
        int[][] dp = new int[prices.length][2];
        //initialize the dp array
        if(prices.length==1) return 0;
        //day 0 with no stock
        dp[0][0] =0;
        //day 0 with  stock
        dp[0][1] = - prices[0];
        //day 1 no stock is from day 0 no sotck or day 0 sold stock
        dp[1][0]= Math.max(dp[0][0],dp[0][1]+prices[1]);
        
        dp[1][1]= Math.max(dp[0][1], -prices[1]);
        
        for(int i=2;i<prices.length;i++){
            dp[i][0]=Math.max(dp[i-1][0],dp[i-1][1]+prices[i]);
            dp[i][1]=Math.max(dp[i-1][1],dp[i-2][0]- prices[i]);
        }
        return dp[prices.length-1][0];
    }
}