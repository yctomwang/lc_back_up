/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 64.66 %
    Runtime : 2 ms
    Memory Usage : 57.7 MB
    Testcase : 22 / 22 passed
    Ranking : 
        Your runtime beats 89.53 % of java submissions.
        Your memory usage beats 59.42 % of java submissions.
}
*/

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int rolling_product=nums[0];
        int [] answer = new int[nums.length];
        answer[0]=1;
        
        for(int i=1;i<nums.length;i++){
            answer[i]= rolling_product;
            rolling_product*= nums[i];
        }
        
       
        int second_rolling=nums[nums.length-1];
        //System.out.println(second_rolling);
        for(int i = nums.length-2;i>=0;i-- ){
            answer[i]=second_rolling*answer[i];
            second_rolling*=nums[i];
        }
        return answer;
    }
}