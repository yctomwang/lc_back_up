/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 41.36 %
    Runtime : 0 ms
    Memory Usage : 47.2 MB
    Testcase : 88 / 88 passed
    Ranking : 
        Your memory usage beats 50.60 % of java submissions.
        Your memory usage beats 00.00 % of submissions.
}
*/

class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length==0){
            return new int[]{-1,-1};
        }
        int left= findFirst(nums,target);
        int right= findLast(nums,target);
        // then return 
        return new int[]{left,right};
        
    }
    // a helper function that helps to find the first occurnace
    public int findFirst(int[] nums, int target){
        int left=0;
        int right=nums.length-1;
        while(left<=right){
           int mid=left+(right-left)/2;
            if(nums[mid]>target){
                right=mid-1;
            }
            else if(nums[mid]<target){
                left=mid+1;
            }
            else if(nums[mid]==target){
                right=mid-1;
            }
            //answer is the left pointer
            
        }
        if(left>nums.length-1){
                return -1;
            }
            if(nums[left]!=target){
                return -1;
            }else{
                return left;
            }
    }
    
    //a helper function that helps to find the last occurance
    public int findLast(int[] nums, int target){
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]>target){
                right=mid-1;
            }
            else if(nums[mid]<target){
                left=mid+1;
            }
            else if(nums[mid]==target){
                left=mid+1;
            }
            //answer is right pointer
        }
        if(right<0){
            return -1;
        }
        
        if(nums[right]!=target){
            return -1;
        }else{
            return right;
        }
        
        
        
        
        
    }
}