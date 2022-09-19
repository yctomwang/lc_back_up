/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 38.50 %
    Runtime : 0 ms
    Memory Usage : 41.8 MB
    Testcase : 195 / 195 passed
    Ranking : 
        Your runtime beats 100.00 % of java submissions.
        Your memory usage beats 91.71 % of java submissions.
}
*/

class Solution {

//this question could be broken into two part, find pviot point in binary search
//then its just your standard crap really
    
    //a helper fucntion that returns the pivot point
    //think of it as finding the peak element
    
    int findpivot(int[] nums){
        if(nums.length==1){
            return 0;
        }
        else if(nums[0]<nums[nums.length-1]){
            return nums.length-1;
        }
        //now to try to find nums
        else{
             //first we need to find peak element
        int leftindex=0;
        int rightindex=nums.length-1;
        while(leftindex<=rightindex){
            int mid= leftindex+(rightindex-leftindex)/2;
            //got to be extra careful here with array that has less than 3 elements
            if(nums[mid+1]<nums[mid]){
                return mid;
                
            }
            else if(nums[leftindex]<=nums[mid]){
                leftindex=mid+1;
            }
            else{
                rightindex=mid-1;
            }
            
        }
        return -100;
            
        }//else
       
    }
    public int search(int[] nums, int target) {
        int pivot=findpivot(nums);
        // System.out.println("thisis"+pivot);
        
        if(target==nums[pivot]){
            
            return pivot;
        }
        //search through the left side
        else if(target<nums[pivot]&&target>=nums[0]){
            int leftindex=0;
            int rightindex=pivot-1;
            while(leftindex<=rightindex){
                int mid= leftindex+(rightindex-leftindex)/2;
                if(nums[mid]==target){
                    return mid;
                }
                else if(nums[mid]<target){
                    leftindex=mid+1;
                    
                }
                else{
                    rightindex=mid-1;
                }
            }
            return -1;
            
        }
        else{
            int leftindex=pivot+1;
            int rightindex=nums.length-1;
            while(leftindex<=rightindex){
                int mid= leftindex+(rightindex-leftindex)/2;
                
                if(nums[mid]==target){
                    return mid;
                }
                else if(nums[mid]<target){
                    leftindex=mid+1;
                    
                }
                else{
                    rightindex=mid-1;
                }
            }
            return -1;
            
        }
        

        
    }
}