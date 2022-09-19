/*
Submission Detail:{
    Difficulty : Easy
    Acceptance Rate : 61.21 %
    Runtime : 2 ms
    Memory Usage : 55.4 MB
    Testcase : 74 / 74 passed
    Ranking : 
        Your runtime beats 84.27 % of java submissions.
        Your memory usage beats 00.00 % of submissions.
}
*/

class Solution {
    public void moveZeroes(int[] nums) {
        // two pointer moving same direction
        int i=0;
        int j=0;
        while(j<nums.length){
            if(nums.length==1){
                nums[i]=nums[j];
                i++;
                j++;
                
                
            }
            else if(j==0&&nums[j]==0){
                j++;
            }
            //consider 0 at first index
            else if(nums[j]!=0){
                nums[i]=nums[j];
                i++;
                j++;
            }
            
            else
            {
                j++;
            }
            
           
        }
        //replace all the zeros
        for(int n= i; n<nums.length;n++){
            nums[n]=0;
        }
    }
}