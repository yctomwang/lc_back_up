/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 44.26 %
    Runtime : 2 ms
    Memory Usage : 57.8 MB
    Testcase : 20 / 20 passed
    Ranking : 
        Your runtime beats 80.81 % of java submissions.
        Your memory usage beats 66.55 % of java submissions.
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
            //System.out.println(temp);
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