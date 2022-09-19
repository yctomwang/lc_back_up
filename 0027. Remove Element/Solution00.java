/*
Submission Detail:{
    Difficulty : Easy
    Acceptance Rate : 51.88 %
    Runtime : 0 ms
    Memory Usage : 42.2 MB
    Testcase : 113 / 113 passed
    Ranking : 
        Your memory usage beats 78.78 % of java submissions.
        Your memory usage beats 00.00 % of submissions.
}
*/

class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0;
        int j=0;
        while(j<nums.length){
            if(nums[j]!=val){
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