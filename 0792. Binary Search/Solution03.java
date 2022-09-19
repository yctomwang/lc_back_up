/*
Submission Detail:{
    Difficulty : Easy
    Acceptance Rate : 55.14 %
    Runtime : 6 ms
    Memory Usage : 54.6 MB
    Testcase : 47 / 47 passed
    Ranking : 
        Your runtime beats 8.28 % of java submissions.
        Your memory usage beats 31.55 % of java submissions.
}
*/

class Solution {
    public int search(int[] nums, int target) {
    int left=0;
    int right=nums.length-1;
        //why left<=right, becuase in case of
        while(left<=right){
            int mid= left+(right-left)/2;
            System.out.println(mid);
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                //if do not exists then it will keep decreasing until we reach right+1=left right =2 left =3 but thats impossible
                right=mid-1;
                
            }
            else if(nums[mid]<target){
                left=mid+1;
            }
        }
        return -1;
    }
}