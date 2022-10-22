/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 40.65 %
    Runtime : 2 ms
    Memory Usage : 41.4 MB
    Testcase : 75 / 75 passed
    Ranking : 
        Your memory usage beats 62.85 % of java submissions.
        Your memory usage beats 00.00 % of submissions.
}
*/

class Solution {
    Integer[] memo;
    Integer[] memo2;
    public int rob(int[] nums) {
        
        if(nums.length==1) return nums[0];
        memo = new Integer[nums.length];
        memo2 = new Integer[nums.length];
        //range from first house to second last house
        //range from second house to last house
        //find which ever one is better, thats it
        int option_2= dfs(nums,nums.length-1);
        int option_1 = dfs2(nums,nums.length-2);
        // System.out.println("Optiontwo"+option_2);
        // System.out.println(option_1);
        return Math.max(option_1,option_2);
    }
    
    // 1-2
    public int dfs(int[] nums, int i){
        if(i<1){
            return 0;
        }
        if(i==1){
            return nums[1];
        }
               
        if(memo[i]!=null) return memo[i];
        
        int curr_val = Math.max(dfs(nums,i-2)+nums[i],dfs(nums,i-1));
        return memo[i] = curr_val;
    }
    
    public int dfs2(int[] nums, int i){
        if(i<0){
            return 0;
        }
        if(i==0){
            return nums[0];
        }
        
        
        if(memo2[i]!=null) return memo2[i];
        
        int curr_val = Math.max(dfs2(nums,i-2)+nums[i],dfs2(nums,i-1));
        return memo2[i] = curr_val;
        
    }
}