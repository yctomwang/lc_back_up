/*
Submission Detail:{
    Difficulty : Easy
    Acceptance Rate : 54.45 %
    Runtime : 4 ms
    Memory Usage : 83.8 MB
    Testcase : 211 / 211 passed
    Ranking : 
        Your runtime beats 37.87 % of java submissions.
        Your memory usage beats 43.53 % of java submissions.
}
*/

class Solution {
    public int maxProfit(int[] prices) {
        int left=0;
        int profit=0;
        //this is like the temp profit
        int temp=0;
        
        for(int i=1;i<prices.length;i++){
           temp=prices[i]-prices[left];
            //System.out.println("left+"+left);
            //System.out.println
            profit=Math.max(profit,temp);
            if(prices[i]<prices[left]){
                left=i;
            }
        
            
        }
        
        return profit;
    }
}