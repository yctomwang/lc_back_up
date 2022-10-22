/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 34.89 %
    Runtime : 7 ms
    Memory Usage : 44.6 MB
    Testcase : 188 / 188 passed
    Ranking : 
        Your runtime beats 24.09 % of java submissions.
        Your memory usage beats 68.92 % of java submissions.
}
*/

class Solution {
    public int maxProduct(int[] nums) {
        int local_max=1;
        int local_min=1;
        int global=nums[0];
        
        //check for boundery case
        if(nums.length==1){
            return nums[0];
        }
        
        for(int i=0;i<nums.length;i++){
            int curr= nums[i];
            int temp = local_max;
            local_max= Math.max(local_max*curr,Math.max(local_min*curr,curr));
            
            local_min = Math.min(local_min*curr,Math.min(temp*curr,curr));
            global=Math.max(global,local_max);
            
        }
        
        return global;
    }
}