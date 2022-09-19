/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 44.26 %
    Runtime : 592 ms
    Memory Usage : 67.6 MB
    Testcase : 20 / 20 passed
    Ranking : 
        Your runtime beats 00.00 % of submissions.
        Your memory usage beats 00.00 % of submissions.
}
*/

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int temp =0;
        int answer=Integer.MAX_VALUE;
        
        for(int i=0; i<nums.length;i++){
            int curr= nums[i];
            temp+=curr;
            System.out.println(temp);
            while(temp>=target){
                answer=Math.min(answer,i-left+1);
                temp-=nums[left];
                left++;
            }
            
            
            //answer=Math.min(answer,i-left+1);
            
        }
        
        if(answer==Integer.MAX_VALUE){
            return 0;
        }
        return answer;
        
    }
}