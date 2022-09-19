/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 41.36 %
    Runtime : 0 ms
    Memory Usage : 47.7 MB
    Testcase : 88 / 88 passed
    Ranking : 
        Your memory usage beats 9.67 % of java submissions.
        Your memory usage beats 00.00 % of submissions.
}
*/

class Solution {
    //first occurance(binary search with left bound)
    int left_bound(int[] nums, int target) {
        
        int leftindex=0;
        int rightindex=nums.length-1;
        while(leftindex<rightindex){
            //automatically round down
            int mid = leftindex+(rightindex-leftindex)/2;
            if(nums[mid]<target){
                leftindex=mid+1;
                
            }
            else if(nums[mid]==target){
                rightindex=mid;
            }
            else{
                rightindex=mid-1;
            }
        }
        
        if(leftindex == nums.length || nums[leftindex] != target){
            return -1;
        }
        return leftindex;
    }
    
    int right_bound(int[] nums, int target){
        int leftindex=0;
        int rightindex=nums.length-1;
        while(leftindex<rightindex){
            //last occurance ,with round down
            int mid = leftindex+(rightindex-leftindex+1)/2;
            if(nums[mid]>target){
                rightindex=mid-1;
            }
            else if(nums[mid]==target){
                leftindex=mid;
            }
            else{
                leftindex=mid+1;
                
            }
            
        }
        
       if(rightindex < 0 || nums[rightindex] != target){
            return -1;
        }
        return rightindex;
    }
    public int[] searchRange(int[] nums, int target) {
        
         return new int[]{left_bound(nums, target), right_bound(nums, target)};
    
        
    }
}