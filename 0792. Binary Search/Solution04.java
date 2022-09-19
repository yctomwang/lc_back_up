/*
Submission Detail:{
    Difficulty : Easy
    Acceptance Rate : 55.14 %
    Runtime : 0 ms
    Memory Usage : 54.3 MB
    Testcase : 47 / 47 passed
    Ranking : 
        Your runtime beats 100.00 % of java submissions.
        Your memory usage beats 53.31 % of java submissions.
}
*/

class Solution {
    public int search(int[] nums, int target) {
    int left=0;
    int right=nums.length-1;
        while(left<=right){
            int mid= left+(right-left)/2;
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
        return -1;
    }
}