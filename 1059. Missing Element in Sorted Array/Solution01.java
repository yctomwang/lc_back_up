/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 54.61 %
    Runtime : 2 ms
    Memory Usage : 58.1 MB
    Testcase : 37 / 37 passed
    Ranking : 
        Your runtime beats 37.32 % of java submissions.
        Your memory usage beats 63.50 % of java submissions.
}
*/

class Solution {
    //4,7,9,10(total number of elements should be nums[end]-nums[start]) 7-4 3 missing
    //0 1 2 3
    //4,5,6,7,8,9,10
    public int missingElement(int[] nums, int k) {
        
        //check for corner case
        int n = nums.length;
        //(nums[n-1]-nums[0]+1) total number of elements
        
        if(k>((nums[n-1]-nums[0]+1)-n)){
            //System.out.println("hi");
            return nums[n-1]+(k-(nums[n-1]-nums[0]+1)+n);
        }
        
       //kth missing number 
        //find the smallest index that has k missing value
        
        int left=0;
        int right=nums.length-1;
        
        while(left<=right){
            int mid = left+(right-left)/2;
            
            if(isValid(nums,k,mid,left)==true){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        //position of pointer
        System.out.println(left);
        System.out.println(right);
        //the right pointer indicates
        //we need to calcualte how many missing numbers right have
        //then calcualte how many missing left have
        //how many elements we shoudld have
        
        int rightMissing=(nums[right]-nums[0]+1)-(right-0+1);
        int leftMissing=(nums[left]-nums[0]+1)-(left-0+1);
        
        
        
        return nums[right]+(k-rightMissing);
        
    }
    //return true if the missing value is larger than or equals =3
    private boolean isValid(int[] nums, int k , int mid,int left){
        left=0;
        // System.out.println("left"+left);
        // System.out.println("mid"+mid);
        // System.out.println((nums[mid]-nums[left]+1)-(mid-left+1));
        if(k<=(nums[mid]-nums[left]+1)-(mid-left+1)){
            
            return true;
        }
        return false;
    }
}