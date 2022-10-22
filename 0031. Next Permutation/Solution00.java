/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 37.07 %
    Runtime : 1 ms
    Memory Usage : 43.7 MB
    Testcase : 265 / 265 passed
    Ranking : 
        Your runtime beats 91.37 % of java submissions.
        Your memory usage beats 47.84 % of java submissions.
}
*/

class Solution {
    //brute force to generate all possible solutions
    //put everything in a heap, then bloody done lol
    public void nextPermutation(int[] nums) {
        //check for corner
        if(nums.length==1||nums.length==0) return;
        int i = nums.length-2;
        
        while(i>=0&&nums[i+1]<=nums[i]){
            i--;
        }
        //now we need to find j the smallest number thats bigger than i
        if(i>=0){
            int j = nums.length-1;
            while(j>=0&&nums[j]<=nums[i]){
                j--;
            }
            swap(nums,i,j);
        }
        reverse(nums,i+1,nums.length-1);
        
        
        
        
    }
    
    private void swap(int[] nums, int l , int r){
        int tmp = nums[l];
        nums[l]= nums[r];
        nums[r] = tmp;
    }
    private void reverse(int[] nums, int l , int r){
        while(l<r){
            swap(nums,l++,r--);
        }
    }
}