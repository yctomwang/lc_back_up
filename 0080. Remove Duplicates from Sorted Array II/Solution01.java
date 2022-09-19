/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 51.31 %
    Runtime : 1 ms
    Memory Usage : 45.1 MB
    Testcase : 164 / 164 passed
    Ranking : 
        Your runtime beats 88.62 % of java submissions.
        Your memory usage beats 15.97 % of java submissions.
}
*/

class Solution {
    public int removeDuplicates(int[] nums) {
        //double pointer approach
        int i=0;
        int j=0;
        while(j<nums.length){
        if(i==0){
            nums[i]=nums[j];
            i++;
            j++;
        }
        else if(i==1){
            nums[i]=nums[j];
            i++;
            j++;
            
        }
        else if(nums[i-1]!=nums[j]||nums[i-2]!=nums[j]){ 
    
        nums[i]=nums[j];
        i++;
        j++;}
       
                
                
        
                
        else{
            j++;
        }
    }
    return i;
}
}