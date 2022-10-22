/*
Submission Detail:{
    Difficulty : Hard
    Acceptance Rate : 44.79 %
    Runtime : 260 ms
    Memory Usage : 124.9 MB
    Testcase : 214 / 214 passed
    Ranking : 
        Your runtime beats 18.24 % of java submissions.
        Your memory usage beats 23.13 % of java submissions.
}
*/

class Solution {
    public int maxProfit(int[] prices) {
        /*
        defintion of dp array is profit at[i]th day with [k]th transaction finished and 
        [1/0] means stock on hand or not
        */
        
        int[][][] dp  = new int[prices.length][3][2]; 
        
        //whem we buy stock we count as once
        
        //no stock exchange
        dp[0][0][0] =0;
        dp[0][1][0] =0;
        //bought stock not yet sold, still count as one trasaction
        dp[0][1][1] = - prices[0];
        
        //bought and sold a share of stock and bought and sold so nothing on hand
        dp[0][2][0] =0;
    
        //bough and sold and bough again not sold the second time
        dp[0][2][1] =-prices[0];
        
        for(int i=1;i<prices.length;i++){
            
            for(int k=2;k>=1;k--){
                dp[i][k][0]= Math.max(dp[i-1][k][0],dp[i-1][k][1]+prices[i]);
                dp[i][k][1]= Math.max(dp[i-1][k][1],dp[i-1][k-1][0]-prices[i]);
            }
        }
        
        return dp[prices.length-1][2][0];
    }
}