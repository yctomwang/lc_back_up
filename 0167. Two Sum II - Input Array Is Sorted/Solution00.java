/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 59.94 %
    Runtime : 2 ms
    Memory Usage : 49.8 MB
    Testcase : 21 / 21 passed
    Ranking : 
        Your runtime beats 81.77 % of java submissions.
        Your memory usage beats 73.92 % of java submissions.
}
*/

class Solution {
    public int[] twoSum(int[] nums, int target) {
    // int[] nums=numbers;
   
    int leftindex=0;
    int rightindex=nums.length-1;
   
    // System.out.println(nums[leftindex]);
    // System.out.println(nums[rightindex]);
    while(leftindex<rightindex){
    
        int sum=nums[leftindex]+nums[rightindex];
        if(sum==target){
            return new int[]{leftindex+1,rightindex+1};
        }
        else if(sum<target){
            leftindex++;
        }
        else{
            rightindex--;
        }
    }
    // 
    return new int[]{leftindex,rightindex};
    
    }
}