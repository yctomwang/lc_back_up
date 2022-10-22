/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 38.52 %
    Runtime : 1119 ms
    Memory Usage : 49.7 MB
    Testcase : 109 / 109 passed
    Ranking : 
        Your memory usage beats 26.31 % of java submissions.
        Your memory usage beats 00.00 % of submissions.
}
*/

class Solution {
    public int jump(int[] nums) {
    //defintion of this would be the minium jumps to get to d[i]
    Integer[] dp = new Integer[nums.length];
    //since the thing can gurantee a solution , so we fill with nums.length
    Arrays.fill(dp,nums.length);  
    dp[0]=0;   
    for(int i=1;i<nums.length;i++){
        //int minimum = nums.length;
        for(int j=0;j<i;j++){
            //if we can reach from position
            if(nums[j]+j>=i){
                dp[i]= Math.min(dp[i],dp[j]+1);
            }
        }
        
    }
    return dp[dp.length-1];
        
    }
}