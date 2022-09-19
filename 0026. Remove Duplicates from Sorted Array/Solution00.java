/*
Submission Detail:{
    Difficulty : Easy
    Acceptance Rate : 50.04 %
    Runtime : 1 ms
    Memory Usage : 47.6 MB
    Testcase : 361 / 361 passed
    Ranking : 
        Your runtime beats 100.00 % of java submissions.
        Your memory usage beats 71.49 % of java submissions.
}
*/

class Solution {
    public int removeDuplicates(int[] nums) {
        int k=0;
        int i =0;
        int j = 0;
        while(j< nums.length){
        if(i==0){
            nums[i]=nums[j];
            i++;
            j++;
           
            
        }
        else if(nums[i-1]!=nums[j]){
            
            nums[i]=nums[j];
            i++;
            j++;
           
        }
        
        else{
            j++;
        }
            
        
        
        }
        return i;
    }
}