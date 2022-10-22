/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 50.03 %
    Runtime : 1 ms
    Memory Usage : 51.7 MB
    Testcase : 209 / 209 passed
    Ranking : 
        Your runtime beats 100.00 % of java submissions.
        Your memory usage beats 91.13 % of java submissions.
}
*/

class Solution {
    public int maxSubArray(int[] nums) {
        int max_sum = Integer.MIN_VALUE;
        int current_sum = 0;
        for(int i=0;i<nums.length;i++){
            int curr = nums[i];
            current_sum+=curr;
             max_sum= Math.max(current_sum,max_sum);
            if(current_sum<0){
                current_sum=0;
            }
           
        }
        
        return max_sum;
    }
}