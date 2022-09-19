/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 46.24 %
    Runtime : 2381 ms
    Memory Usage : 42.4 MB
    Testcase : 281 / 281 passed
    Ranking : 
        Your memory usage beats 93.22 % of java submissions.
        Your memory usage beats 00.00 % of submissions.
}
*/

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        //binary search approach
        //sort the input
        //nlogn
        int answer=nums[0]+nums[1]+nums[2];
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
              int searchtarget = target - nums[i] - nums[j];
                int leftbound=j+1;
                int rightbound=nums.length-1;
                while(leftbound<rightbound-1){
                    int mid = leftbound+(rightbound-leftbound)/2;
                    if(nums[mid]<searchtarget){
                        leftbound=mid;
                    }
                    else{
                        rightbound=mid;
                    }
                    
                    
                }
                int rightval=nums[rightbound];
                int leftval=nums[leftbound];
                if(rightval<searchtarget){
                    int tempanswer=rightval+nums[i]+nums[j];
                    if(Math.abs(target-tempanswer)<Math.abs(target-answer)){
                        answer=tempanswer;
                    }
                }
                
                else if(leftval>searchtarget){
                    int tempanswer=leftval+nums[i]+nums[j];
                    if(Math.abs(target-tempanswer)<Math.abs(target-answer)){
                        answer=tempanswer;
                    }
                }
                else{
                    if(Math.abs(searchtarget-leftval)<Math.abs(searchtarget-rightval)){
                        int tempanswer=leftval+nums[i]+nums[j];
                    if(Math.abs(target-tempanswer)<Math.abs(target-answer)){
                        answer=tempanswer;
                    }
                        
                    }
                       else{int tempanswer=rightval+nums[i]+nums[j];
                    if(Math.abs(target-tempanswer)<Math.abs(target-answer)){
                        answer=tempanswer;
                    }}
                }
            }
        }
        return answer;
                       }
                       
}