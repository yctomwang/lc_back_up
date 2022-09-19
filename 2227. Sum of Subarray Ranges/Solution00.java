/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 60.24 %
    Runtime : 40 ms
    Memory Usage : 44.5 MB
    Testcase : 71 / 71 passed
    Ranking : 
        Your runtime beats 22.43 % of java submissions.
        Your memory usage beats 81.48 % of java submissions.
}
*/

class Solution {
    public long subArrayRanges(int[] nums) {
        long answer=0;
        for(int i=0;i<nums.length;i++){
            int max=nums[i];
            int min=nums[i];
            for(int j=i;j<nums.length;j++){
                max=Math.max(max,nums[j]);
                min=Math.min(min,nums[j]);
                answer+=(max-min);
                
                
            }
            
            
        }
        
        return answer;
    }
}