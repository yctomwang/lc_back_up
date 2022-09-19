/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 48.37 %
    Runtime : 21 ms
    Memory Usage : 43.3 MB
    Testcase : 150 / 150 passed
    Ranking : 
        Your runtime beats 00.00 % of submissions.
        Your memory usage beats 00.00 % of submissions.
}
*/

class Solution {
    public int findMin(int[] nums) {
        
        //target 's left 
        if(nums.length==1){
            return nums[0];
        }
        //then the thing is not rotated
        if(nums[0]<nums[nums.length-1]){
            return nums[0];
        }
        int leftindex=0;
        int rightindex=nums.length-1;
        
        while(leftindex<rightindex){
            
            int mid= leftindex+(rightindex-leftindex)/2;
                System.out.println("left"+leftindex);
            System.out.println("right"+rightindex);
            System.out.println("mid"+mid);
            //if left is bigger than right
            if(nums[mid]<=nums[leftindex]){
                rightindex=mid;
                
            }
            else if(nums[mid]>nums[leftindex]){
                leftindex=mid;
            }
            
        }
        System.out.println(leftindex);
        return nums[leftindex+1];
    }
}