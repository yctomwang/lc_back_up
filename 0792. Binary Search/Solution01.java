/*
Submission Detail:{
    Difficulty : Easy
    Acceptance Rate : 55.14 %
    Runtime : 0 ms
    Memory Usage : 53.8 MB
    Testcase : 47 / 47 passed
    Ranking : 
        Your runtime beats 100.00 % of java submissions.
        Your memory usage beats 78.01 % of java submissions.
}
*/

class Solution {
    public int search(int[] nums, int target) {
    int left=0;
    int right=nums.length-1;
        //why left<=right, becuase in case of
        while(left<=right){
            int mid= left+(right-left)/2;
           // System.out.println(mid);
            if(nums[mid]==target){
                right=mid-1;
            }
            else if(nums[mid]>target){
                //if do not exists then it will keep decreasing until we reach right+1=left right =2 left =3 but thats impossible
                right=mid-1;
                
            }
            else if(nums[mid]<target){
                left=mid+1;
            }
        }
        // System.out.println("left"+nums[left]);
        // System.out.println("target"+target);
        if(left>nums.length-1) return -1;
        if(nums[left]==target) return left;
        else return -1;
        //return -1;
    }
}