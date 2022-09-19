/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 60.20 %
    Runtime : 132 ms
    Memory Usage : 84.2 MB
    Testcase : 58 / 58 passed
    Ranking : 
        Your runtime beats 8.13 % of java submissions.
        Your memory usage beats 34.55 % of java submissions.
}
*/

class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        // isValid(nums,maxOperations,129);
        // return 0;
        int left=1;
        int right=0;
        for(int i=0;i<nums.length;i++){
            right=Math.max(right,nums[i]);
        }
        //System.out.println(right);
        while(left<=right){
            int mid = left+(right-left)/2;
            if(isValid(nums,maxOperations,mid)==true){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        
        return left;
    }
    //mid means the max number of balls
    public boolean isValid(int[] nums, int operation, int mid){
        //System.out.println(mid);
        int opcount=0;
        for(int i=0;i<nums.length;i++){
            if(opcount>operation)break;
            if(nums[i]<=mid){
                continue;
            }
            else{
                int curr= nums[i];
                if(curr%mid==0){
                    opcount+=Math.floorDiv(curr,mid)-1;
                }else{
                    opcount+=Math.floorDiv(curr,mid);
                }

                

            }
        }
        //System.out.println(opcount);
        if(opcount<=operation){
            return true;
        }
        return false;
    }
}