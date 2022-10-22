/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 38.52 %
    Runtime : 914 ms
    Memory Usage : 50.4 MB
    Testcase : 109 / 109 passed
    Ranking : 
        Your memory usage beats 6.84 % of java submissions.
        Your memory usage beats 00.00 % of submissions.
}
*/

class Solution {
    public int jump(int[] nums) {
    //defintion of this would be the minium cost to get to d[i]
    Integer[] dp = new Integer[nums.length];
    Arrays.fill(dp,nums.length);
    //the minimum number of jumps of the first index is reaching the first index is     
    dp[0]=0;   
    for(int i=1;i<nums.length;i++){
        int minimum = nums.length;
        for(int j=0;j<i;j++){
            if(nums[j]+j>=i){
                dp[i]= Math.min(dp[i],dp[j]+1);
            }
        }
        
    }
    return dp[dp.length-1];
        
    //to reach dp i 
    //
        
    }
    //relationship equation
    //dp[i]=Math.min(dp[])
    
//     public int dfs(int nums, Integer[] memo, int i){
//         if(i>=nums.length-1){
//             //we have reached the end
//             return 0;
//         }
        
//         return 1;
        
        
//     }
}