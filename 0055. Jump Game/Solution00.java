/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 38.42 %
    Runtime : 483 ms
    Memory Usage : 42.7 MB
    Testcase : 170 / 170 passed
    Ranking : 
        Your runtime beats 13.02 % of java submissions.
        Your memory usage beats 93.15 % of java submissions.
}
*/

class Solution {
    Boolean[] memo;
    
    //start from 0 work to i
    public boolean canJump(int[] nums) {
        if(nums.length==1)return true;
        memo= new Boolean[nums.length];
        return dfs(nums,0);
    }
    
    public boolean dfs(int[] nums, int i){
        if(i>=nums.length-1)return true;
        if(memo[i]!=null) return memo[i];
        if(nums[i]==0) return memo[i]=false;
        
        for(int j=i+1;j<=i+nums[i];j++){
            if(dfs(nums,j)){
                return memo[i]=true;
            }
        }
        return memo[i]=false;
        
        
    }
}