/*
Submission Detail:{
    Difficulty : Easy
    Acceptance Rate : 42.02 %
    Runtime : 0 ms
    Memory Usage : 43.4 MB
    Testcase : 64 / 64 passed
    Ranking : 
        Your memory usage beats 59.72 % of java submissions.
        Your memory usage beats 00.00 % of submissions.
}
*/

class Solution {
    public int searchInsert(int[] nums, int target) {
       //this is a binary search probem right?
        int left=0;
        int right=nums.length-1;
        
        //return the index of 5 if it does exist
        //return the index of the smallest value thats larger than target
        while(left<=right){
            int mid = left+(right-left)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                right=mid-1;
            }
            else if(nums[mid]<target){
                left=mid+1;
            }
        }
        
        if(left>nums.length-1){
            return nums.length;
        }
        return left;
        
    }
}